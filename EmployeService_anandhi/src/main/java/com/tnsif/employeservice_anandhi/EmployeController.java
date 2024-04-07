package com.tnsif.employeservice_anandhi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeController {
	@Autowired
	private EmployeService service;
	
	@PostMapping("/employeservice")
	public void add(@RequestBody Employe emp)
	{
		service.insertRecord(emp);
	}
	
	
	@GetMapping("/employerservice")
	public List<Employe> ShowAll()
	{
		return service.getAllRecords();
	}

	
	@GetMapping("/employeservice/{id}")
	public Employe getEmployeById(@PathVariable Integer eid)
	{
		return service.getEmployeById(eid);
	}
	
	@DeleteMapping("/employeservice/{eid}")
	public void deleteEmploye(@PathVariable Integer eid)
	{
		service.deleteEmploye(eid);
	}
	
	@PutMapping("/employeservice/{eid}")
	public ResponseEntity<String> updateEmploye(@PathVariable Integer eid,@RequestBody Employe updateEmploye)
	{
		service.updateEmploye(eid,updateEmploye);
		return ResponseEntity.ok("Employe updated Successfully");
	}


}
