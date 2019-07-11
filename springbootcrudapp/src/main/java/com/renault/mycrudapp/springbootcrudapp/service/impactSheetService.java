package com.renault.mycrudapp.springbootcrudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renault.mycrudapp.springbootcrudapp.model.ImpactSheet;
import com.renault.mycrudapp.springbootcrudapp.repository.impactSheetRepository;

@Service
public class impactSheetService {

	@Autowired
	impactSheetRepository isRepo;
	
	public ImpactSheet getImpactSheet(int id) {
		return isRepo.findById(id).orElse(null);
	}
	
	public void saveImpactSheet(ImpactSheet is) {
		isRepo.save(is);
	}
	
	public List<ImpactSheet> getAllImpactSheet() {
		return isRepo.findAll();
	}
	
}
