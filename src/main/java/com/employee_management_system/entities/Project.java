package com.employee_management_system.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Entity
@Data
public class Project {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int projectNumber;
	private String projectName;
	private String projectLocation;
	@ManyToMany(mappedBy = "project")
	private List<Employee> employee = new ArrayList<>();

}
