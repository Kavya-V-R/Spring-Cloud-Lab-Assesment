package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.model.Department;

@Repository
public interface DeparmentRepo extends JpaRepository<Department,Integer>{


}