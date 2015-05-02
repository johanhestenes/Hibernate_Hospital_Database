package edu.cs157b.hibernate.hospital;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ConcreteMedicalDAO implements MedicalDAO
{
	private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	@Override
	public Doctor createDoctor(Doctor doctor) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
	    session.save(doctor);
	    
	    session.getTransaction().commit();
	    session.close();
	    return doctor;
	}
	

	@Override
	public Doctor viewDoctor(String name, String specialty) 
	{		
		Session session = sessionFactory.openSession();
	    session.beginTransaction();
		Object pojo  = session.get(Doctor.class, name);
		session.getTransaction().commit();
		return (Doctor)pojo;
	}

	@Override
	public boolean deleteDoctor(String name) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Doctor doctor = viewDoctor(name, "");
	    session.delete(doctor);
	    session.getTransaction().commit();
	    session.close();
		return true;
	}

	@Override
	public Patient createPatient(Patient patient) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
	    session.save(patient);
	    
	    session.getTransaction().commit();
	    session.close();
	    return patient;
	}

	@Override
	public Patient viewPatient(String name, String DOB) 
	{
		Session session = sessionFactory.openSession();
	    session.beginTransaction();
		Object pojo  = session.get(Patient.class, name);
		session.getTransaction().commit();
		return (Patient)pojo;
	}

	@Override
	public boolean deletePatient(String name, String DOB) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Patient patient = viewPatient(name, DOB);
	    session.delete(patient);
	    session.getTransaction().commit();
	    session.close();
		return true;
	}

	@Override
	public Appointment createAppointment(Appointment appointment)
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
	    session.save(appointment);
	    
	    session.getTransaction().commit();
	    session.close();
	    return appointment;
	}

	@Override
	public boolean deleteAppointment(String date, Patient patient) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Appointment appointment = viewAppointment(date);
	    session.delete(appointment);
	    session.getTransaction().commit();
	    session.close();
		return true;
	}

	@Override
	public Prescription createPrescription(Prescription prescription) 
	{
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
	    session.save(prescription);
	    
	    session.getTransaction().commit();
	    session.close();
	    return prescription;
	}

	@Override
	public Appointment viewAppointment(String date) 
	{
		Session session = sessionFactory.openSession();
	    session.beginTransaction();
		Object pojo  = session.get(Appointment.class, date);
		session.getTransaction().commit();
		return (Appointment)pojo;
	}

	@Override
	public Prescription viewPrescription(String medication) 
	{
		Session session = sessionFactory.openSession();
	    session.beginTransaction();
		Object pojo  = session.get(Prescription.class, medication);
		session.getTransaction().commit();
		return (Prescription)pojo;
	}
}
