package edu.cs157b.hibernate.hospital;

public interface MedicalDAO 
{
	// administrator
	Doctor createDoctor(Doctor doctor);
	Doctor viewDoctor(String name, String specialty); // also used by patient
	boolean deleteDoctor(String name);
	Patient createPatient(Patient patient);
	Patient viewPatient(String name, String DOB); // also used by doctor
	boolean deletePatient(String name, String DOB);
	
	// staff
	Appointment createAppointment(Appointment appointment);
	boolean deleteAppointment(String date, Patient patient);
	
	// doctor
	Prescription createPrescription(Prescription prescription);
	
	// patient
	Appointment viewAppointment(String date);
	Prescription viewPrescription(String medication);
}
