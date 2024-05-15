package com.luminar.getmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luminar.getmed.entity.GetMedMedicine;

@Repository
public interface GetMedMedicineRepository extends JpaRepository<GetMedMedicine, Long> {
}
