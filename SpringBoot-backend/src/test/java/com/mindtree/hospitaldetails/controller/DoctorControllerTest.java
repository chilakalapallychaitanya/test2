package com.mindtree.hospitaldetails.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.hospitaldetails.entity.Doctor;
import com.mindtree.hospitaldetails.entity.Patient;
import com.mindtree.hospitaldetails.repository.DoctorRepository;
import com.mindtree.hospitaldetails.repository.PatientRepository;

@SpringBootTest
public class DoctorControllerTest {
	

	@Autowired
	private DoctorRepository doctorRepository;
	
	@Autowired
	private PatientRepository patientRepository; 
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void test_AddDoctor() {
		Doctor doctor = new Doctor();
		doctor.setName("vijay kumar");
		doctor.setAge(23);
		doctor.setField("orthopedics");
		doctor.setGender("Male");
		doctor.getPatient_count();
		
		doctorRepository.save(doctor);
		
		assertNotNull(doctorRepository.findAll());		
	}

	@Test
	public void test_getDoctor() {
		Doctor doctor = doctorRepository.findById(23).get();
		assertEquals("vijay kumar", doctor.getName());
	}

	@Test
	public void test_AddPatient() {
		Patient patient = new Patient();
		patient.setAge(25);
		patient.setDoctor_name("Harsha Dev");
		patient.setName("vamsi N");
		patient.setGender("Male");
		patient.setId(7);
		
		assertNotNull(patientRepository.findAll());
	}
	
	@Test
	public void test_getPatientById() {
		Patient patient = patientRepository.findById(2).get();
		assertEquals("kiran kumar", patient.getName());
	}
}
	
	
	
