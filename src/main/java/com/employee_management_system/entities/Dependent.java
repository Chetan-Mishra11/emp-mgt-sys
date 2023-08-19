package com.employee_management_system.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Dependent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int d_no;
	private String d_name;
	private String gender;
	private String relationship;
	@ManyToOne
	@JoinColumn(name = "employee_id")
	private Employee employee;

}
