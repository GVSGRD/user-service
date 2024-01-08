package com.startupsync.com.userservice.repository;


import com.startupsync.com.userservice.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
	List<Education> findByUserId(Long userId);
}