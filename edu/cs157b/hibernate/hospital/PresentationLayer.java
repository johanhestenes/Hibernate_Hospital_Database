package edu.cs157b.hibernate.hospital;
import java.util.Scanner;

public class PresentationLayer 
{	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	      
	    boolean quit1 = false;
	    while (!quit1)
	    {
	    	System.out.println("Select one of the following options: ");
	        System.out.println("[D]octor [P]atient [A]dministrator [S]taff [Q]uit");
	        String input1 = in.nextLine();
	        
	        if (input1.equals("D"))
	        {
	        	boolean quit2 = false;
	        	while (quit2 == false)
	        	{
		        	System.out.println("Select one of the following options: ");
		        	System.out.println("[1] View patient information (search using both name and DOB)");
					System.out.println("[2] Create prescription for patient");
					System.out.println("[3] Exit");
					String input2 = in.nextLine();
					
					if (input2.equals("1"))
			        {
						System.out.println("Enter the patient's name: ");
						String patientName = in.nextLine();
						System.out.println("Enter the patient's date of birth: ");
						String patientDOB = in.nextLine();
			        	
			        	MedicalDAO md = new ConcreteMedicalDAO();
			        	
			        	if (md.viewPatient(patientName, patientDOB) != null)
			        	{
			        		System.out.println("This patient exists and is in the system.");
			        	}
			        	else
			        	{
			        		System.out.println("This patient does not exist within the system.");
			        	}
			        }
			        else if (input2.equals("2"))
			        {
						System.out.println("Enter the medication's name: ");
						String medicationName = in.nextLine();
						System.out.println("Enter a date for the prescription: ");
						String prescriptionDate = in.nextLine();
						
						MedicalDAO service = new ServiceLayer();
						
						Prescription prescription = new Prescription();
				    	prescription.setMedication(medicationName);
				    	prescription.setDate(prescriptionDate);
						
						service.createPrescription(prescription);
			        }
			        else if (input2.equals("3"))
			        {
			        	quit2 = true;
			        }
	        	}
	        }
	        else if (input1.equals("P"))
	        {
	        	boolean quit3 = false;
	        	while (quit3 == false)
	        	{
		        	System.out.println("Select one of the following options: ");
		        	System.out.println("[1] View appointment list");
					System.out.println("[2] View prescription from doctor");
					System.out.println("[3] View doctor's information in the hospital");
					System.out.println("[4] Exit");
					String input3 = in.nextLine();
					
					if (input3.equals("1"))
			        {
						System.out.println("Enter the appointment date: ");
						String apppointmentDate = in.nextLine();
						
			        	
			        	MedicalDAO md = new ConcreteMedicalDAO();
			        	
			        	if (md.viewAppointment(apppointmentDate) != null)
			        	{
			        		System.out.println("This appointment exists and is in the system.");
			        	}
			        	else
			        	{
			        		System.out.println("This appointment does not exist within the system.");
			        	}
			        }
			        else if (input3.equals("2"))
			        {
			        	System.out.println("Enter the prescription's medication name: ");
						String medication = in.nextLine();
						
			        	
			        	MedicalDAO md = new ConcreteMedicalDAO();
			        	
			        	if (md.viewPrescription(medication) != null)
			        	{
			        		System.out.println("This prescription exists and is in the system.");
			        	}
			        	else
			        	{
			        		System.out.println("This prescription does not exist within the system.");
			        	}
			        }
			        else if (input3.equals("3"))
			        {
			        	System.out.println("Enter the doctor's name: ");
						String doctorName = in.nextLine();
						System.out.println("Enter the doctor's specialty: ");
						String doctorSpecialty = in.nextLine();
			        	
			        	MedicalDAO md = new ConcreteMedicalDAO();
			        	
			        	if (md.viewDoctor(doctorName, doctorSpecialty) != null)
			        	{
			        		System.out.println("This doctor exists and is in the system.");
			        	}
			        	else
			        	{
			        		System.out.println("This doctor does not exist within the system.");
			        	}
			        }
			        else if (input3.equals("4"))
			        {
			        	quit3 = true;
			        }
	        	}
	        }
	        else if (input1.equals("A"))
	        {
	        	boolean quit4 = false;
	        	while (quit4 == false)
	        	{
		        	System.out.println("Select one of the following options: ");
		        	System.out.println("[1] Create doctor account");
					System.out.println("[2] View doctor account (by name and also by specialty)");
					System.out.println("[3] Delete doctor account (by name)");
					System.out.println("[4] Create patient account");
					System.out.println("[5] View patient account (search using both name and DOB)");
					System.out.println("[6] Delete patient account (search using both name and DOB)");
					System.out.println("[7] Exit");
					String input4 = in.nextLine();
					
					if (input4.equals("1"))
			        {
						System.out.println("Enter the doctor's name: ");
						String doctorName = in.nextLine();
						System.out.println("Enter the doctor's specialty: ");
						String doctorSpecialty = in.nextLine();
						
						MedicalDAO service = new ServiceLayer();
						
						Doctor doctor = new Doctor();
				    	doctor.setName(doctorName);
				    	doctor.setSpecialty(doctorSpecialty);
						
						service.createDoctor(doctor);
			        }
			        else if (input4.equals("2"))
			        {
			        	System.out.println("Enter the doctor's name: ");
						String doctorName = in.nextLine();
						System.out.println("Enter the doctor's specialty: ");
						String doctorSpecialty = in.nextLine();
			        	
			        	MedicalDAO md = new ConcreteMedicalDAO();
			        	
			        	if (md.viewDoctor(doctorName, doctorSpecialty) != null)
			        	{
			        		System.out.println("This doctor exists and is in the system.");
			        	}
			        	else
			        	{
			        		System.out.println("This doctor does not exist within the system.");
			        	}
			        }
			        else if (input4.equals("3"))
			        {
			        	System.out.println("Enter the doctor's name: ");
						String doctorName = in.nextLine();
						
						MedicalDAO md = new ConcreteMedicalDAO();
						
						try
						{
							if (md.deleteDoctor(doctorName) == true)
							{
								System.out.println("Doctor was deleted from the system.");
							}
						}
						catch (IllegalArgumentException ex)
						{
							System.out.println("ERROR: Invalid name entered.");
						}
			        }
			        else if (input4.equals("4"))
			        {
			        	System.out.println("Enter the patients's name: ");
						String patientName = in.nextLine();
						System.out.println("Enter the patients's date of birth: ");
						String patientDOB = in.nextLine();
						
						MedicalDAO service = new ServiceLayer();
						
						Patient patient = new Patient();
				    	patient.setName(patientName);
				    	patient.setDOB(patientDOB);
				    	
						service.createPatient(patient);
			        }
			        else if (input4.equals("5"))
			        {
			        	System.out.println("Enter the patient's name: ");
						String patientName = in.nextLine();
						System.out.println("Enter the patient's date of birth: ");
						String patientDOB = in.nextLine();
			        	
			        	MedicalDAO md = new ConcreteMedicalDAO();
			        	
			        	if (md.viewPatient(patientName, patientDOB) != null)
			        	{
			        		System.out.println("This patient exists and is in the system.");
			        	}
			        	else
			        	{
			        		System.out.println("This patient does not exist within the system.");
			        	}
			        }
			        else if (input4.equals("6"))
			        {
			        	System.out.println("Enter the patient's name: ");
						String patientName = in.nextLine();
						System.out.println("Enter the patient's date of birth: ");
						String patientDOB = in.nextLine();
						
						MedicalDAO md = new ConcreteMedicalDAO();
						
						try
						{
							if (md.deletePatient(patientName, patientDOB) == true)
							{
								System.out.println("Patient was deleted from the system.");
							}
						}
						catch (IllegalArgumentException ex)
						{
							System.out.println("ERROR: Invalid name entered.");
						}
			        }
			        else if (input4.equals("7"))
			        {
			        	quit4 = true;
			        }
	        	}
	        }
	        else if (input1.equals("S"))
	        {
	        	boolean quit5 = false;
	        	while (quit5 == false)
	        	{
		        	System.out.println("Select one of the following options: ");
		        	System.out.println("[1] Create appointment for a patient (For simplicity, let's assume a patient appointment request is always accepted.)");
					System.out.println("[2] Delete (cancel) appointment (search by date if a patient has multiple appointments) for a patient (by both name and DOB)");
					System.out.println("[3] Exit");
					String input5 = in.nextLine();
					
					if (input5.equals("1"))
			        {
						System.out.println("Enter the appointment date: ");
						String appointmentDate = in.nextLine();
						System.out.println("Enter the appointment doctor: ");
						String appointmentDoctor = in.nextLine();
						
						MedicalDAO service = new ServiceLayer();
						
						Appointment appointment = new Appointment();
				    	appointment.setDate(appointmentDate);
				    	appointment.setDoctor(appointmentDoctor);
						
						service.createAppointment(appointment);
			        }
			        else if (input5.equals("2"))
			        {
			        	System.out.println("Enter the appointment date: ");
						String appointmentDate = in.nextLine();
						
						MedicalDAO md = new ConcreteMedicalDAO();
						
						try
						{
							if (md.deleteAppointment(appointmentDate, new Patient()) == true)
							{
								System.out.println("Appointment was cancelled.");
							}
						}
						catch (IllegalArgumentException ex)
						{
							System.out.println("ERROR: Invalid appointment date entered.");
						}
			        }
			        else if (input5.equals("3"))
			        {
			        	quit5 = true;
			        }
	        	}
	        }
	        else if (input1.equals("Q"))
	        {
	        	quit1 = true;
	        	
	        	in.close();
	        	System.exit(0);
	        }
	    }
	}
}
