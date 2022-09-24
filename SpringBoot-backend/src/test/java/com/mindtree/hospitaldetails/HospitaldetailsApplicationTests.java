package com.mindtree.hospitaldetails;

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
class HospitaldetailsApplicationTests {
	

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
		doctor.setName("santoosh");
		doctor.setAge(34);
		doctor.setField("porthology");
		doctor.setGender("male");
		doctor.getPatient_count();
		
		doctorRepository.save(doctor);
	Doctor d = doctorRepository.findByName("santoosh");
		assertEquals(d.getAge(),doctor.getAge());		
	}

	@Test
	public void test_getDoctor() {
		Doctor doctor = doctorRepository.findByName("Arun");
		assertEquals("Arun", doctor.getAge());
	}

	@Test
	public void test_AddPatient() {
		Patient patient = new Patient();
		patient.setAge(25);
		patient.setDoctor_name("subbhu");
		patient.setName("kumari");
		patient.setGender("female");
		patient.setId(29);
		
		assertNotNull(patientRepository.findAll());
	}
	
	@Test
	public void test_getPatientById() {
		Patient patient = patientRepository.findById(2).get();
		assertEquals("bindu", patient.getName());
	}

	}
