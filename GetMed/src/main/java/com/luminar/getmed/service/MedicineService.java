package com.luminar.getmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.getmed.entity.GetMedMedicine;
import com.luminar.getmed.repository.GetMedMedicineRepository;

@Service
public class MedicineService {

	@Autowired
	private GetMedMedicineRepository medicineRepository;

	public GetMedMedicine createMedicine(GetMedMedicine medicine) {
		return medicineRepository.save(medicine);
	}

	public List<GetMedMedicine> getAllMedicines() {
		return medicineRepository.findAll();
	}

	public GetMedMedicine getMedicineById(Long med_id) {
		Optional<GetMedMedicine> medicineOptional = medicineRepository.findById(med_id);
		return medicineOptional.orElse(null);
	}

	public GetMedMedicine updateMedicine(Long med_id, GetMedMedicine updatedMedicine) {
		Optional<GetMedMedicine> medicineOptional = medicineRepository.findById(med_id);
		if (medicineOptional.isPresent()) {
			GetMedMedicine medicine = medicineOptional.get();
			medicine.setName(updatedMedicine.getName());
			medicine.setDescription(updatedMedicine.getDescription());
			medicine.setUsage(updatedMedicine.getUsage());
			medicine.setPrice(updatedMedicine.getPrice());
			return medicineRepository.save(medicine);
		}
		return null;
	}

	public void deleteMedicine(Long med_id) {
		medicineRepository.deleteById(med_id);
	}

	public MedicineService findById(Long med_id) {
		return null;
	}

	public void save(GetMedMedicine medicine) {

	}

	public void deleteById(Long med_id) {

	}
}
