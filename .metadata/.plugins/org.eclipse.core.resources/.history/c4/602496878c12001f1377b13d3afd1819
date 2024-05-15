package com.luminar.getmed.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.luminar.getmed.entity.GetMedUser;

@Repository
public interface GetMedUserRepository extends JpaRepository<GetMedUser, Long> {
    GetMedUser findByUsername(String username);
}
