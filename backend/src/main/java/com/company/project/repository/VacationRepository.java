package com.company.project.repository;


import com.company.project.entity.Vacation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacationRepository extends JpaRepository<Vacation,Long> {
}
