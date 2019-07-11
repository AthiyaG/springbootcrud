package com.renault.mycrudapp.springbootcrudapp.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.renault.mycrudapp.springbootcrudapp.model.ImpactSheet;
import com.renault.mycrudapp.springbootcrudapp.service.impactSheetService;

@RestController
@CrossOrigin
@RequestMapping("/fih")
public class impactSheetCtrllr {
	
	@Autowired
	impactSheetService isService;

	@GetMapping("/getIS/{id}")
	public ImpactSheet getImpactSheet(@PathVariable (name="id") int id ) {
		return isService.getImpactSheet(id);
	}
	
	@GetMapping("/getAllIS")
	public List<ImpactSheet> getAllImpactSheet() {
		return isService.getAllImpactSheet();
	}
	
	@PostMapping("/saveIS")
	public void saveIS(@RequestBody ImpactSheet is) {
		isService.saveImpactSheet(is);
	}
	
}
