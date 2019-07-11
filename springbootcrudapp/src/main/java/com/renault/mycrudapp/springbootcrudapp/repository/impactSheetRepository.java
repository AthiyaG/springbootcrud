package com.renault.mycrudapp.springbootcrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.renault.mycrudapp.springbootcrudapp.model.ImpactSheet;

@Repository
public interface impactSheetRepository extends JpaRepository<ImpactSheet, Integer> {

}
