package com.tnsif.employeservice_anandhi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeService {
	@Autowired
	private EmployeRepository repo;
	public void insertRecord(Employe emp)
	{
		 repo.save(emp);
	}
	
	
	public List<Employe> getAllRecords()
	{
		return repo.findAll();
	}
	
	
	public Employe getEmployeById(Integer eid)
	{
		return repo.findById(eid).orElse(null);
	}
	public void deleteEmploye(Integer eid)
	{
		repo.deleteById(eid);
	}
	public void updateEmploye(Integer eid,Employe updateEmploye)
	{
		Employe existingEmploye=repo.findById(eid).orElse(null);
		if(existingEmploye!=null)
		{
			existingEmploye.setEid(updateEmploye.getEid());
			existingEmploye.setName(updateEmploye.getName());
			existingEmploye.setDepartment(updateEmploye.getDepartment());
			existingEmploye.setDesignation(updateEmploye.getDesignation());
			existingEmploye.setMailid(updateEmploye.getMailid());
			existingEmploye.setAddress(updateEmploye.getAddress());
			existingEmploye.setSalary(updateEmploye.getSalary());
			repo.save(existingEmploye);
		}
	}
}
