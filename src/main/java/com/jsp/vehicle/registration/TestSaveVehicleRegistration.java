package com.jsp.vehicle.registration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVehicleRegistration { 
	public static void main(String[] args) {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishu");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction(); 
    
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Car");
    vehicle.setManufacturer("Porsche");
    vehicle.setModel("911");
    vehicle.setYear(2023);
    vehicle.setColor("Yellow");

    Registration registration = new Registration();
    registration.setRegistrationNumber("MH-2506");
    registration.setRegistrationState("Maharashta");
    registration.setOwnerName("Vishu Saini"); 
	vehicle.setRegistration(registration);

	entityTransaction.begin(); 
	entityManager.persist(vehicle); 
	entityManager.persist(registration);
	entityTransaction.commit(); 
	
	}
}
