package edu.cs157b.hibernate.hospital;

public class ServiceLayer implements MedicalDAO
{

	@Override
	public Doctor createDoctor(Doctor doctor) 
	{
    	MedicalDAO md = new ConcreteMedicalDAO();
    	md.createDoctor(doctor);
    	return doctor;
	}

	@Override
	public Patient createPatient(Patient patient) 
	{
		MedicalDAO md = new ConcreteMedicalDAO();
    	md.createPatient(patient);
    	return patient;
	}
	
	@Override
	public Appointment createAppointment(Appointment appointment) 
	{
		MedicalDAO md = new ConcreteMedicalDAO();
    	md.createAppointment(appointment);
    	return appointment;
	}
	
	@Override
	public Doctor viewDoctor(String name, String specialty) 
	{
		return null;
	}

	@Override
	public boolean deleteDoctor(String name) 
	{
		return false;
	}

	@Override
	public Patient viewPatient(String name, String DOB) 
	{
		return null;
	}

	@Override
	public boolean deletePatient(String name, String DOB) 
	{
		return false;
	}

	@Override
	public boolean deleteAppointment(String date, Patient patient) 
	{
		return false;
	}

	@Override
	public Prescription createPrescription(Prescription prescription) 
	{
		MedicalDAO md = new ConcreteMedicalDAO();
    	md.createPrescription(prescription);
    	return prescription;
	}

	@Override
	public Appointment viewAppointment(String date) 
	{
		return null;
	}

	@Override
	public Prescription viewPrescription(String medication)
	{
		return null;
	}
}
