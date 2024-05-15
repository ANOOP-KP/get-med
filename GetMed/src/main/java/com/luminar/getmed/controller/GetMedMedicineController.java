package com.luminar.getmed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luminar.getmed.entity.GetMedMedicine;
import com.luminar.getmed.service.MedicineService;

@RestController
@RequestMapping("/api/medicines")
public class GetMedMedicineController {

	@Autowired
	private MedicineService medicineService;

	@PostMapping("/add")
	public ResponseEntity<String> addMedicine(@RequestBody GetMedMedicine medicine) {
		medicineService.save(medicine);
		return new ResponseEntity<>("Medicine added successfully", HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<MedicineService> getMedicineById(@PathVariable Long id) {
		MedicineService medicine = medicineService.findById(id);
		if (medicine == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(medicine, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> updateMedicine(@PathVariable Long id, @RequestBody GetMedMedicine medicine) {
		MedicineService existingMedicine = medicineService.findById(id);
		if (existingMedicine == null) {
			return new ResponseEntity<>("Medicine not found", HttpStatus.NOT_FOUND);
		}
		medicine.setId(id);
		medicineService.save(medicine);
		return new ResponseEntity<>("Medicine updated successfully", HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteMedicine(@PathVariable Long id) {
		MedicineService existingMedicine = medicineService.findById(id);
		if (existingMedicine == null) {
			return new ResponseEntity<>("Medicine not found", HttpStatus.NOT_FOUND);
		}
		medicineService.deleteById(id);
		return new ResponseEntity<>("Medicine deleted successfully", HttpStatus.OK);
	}

}
