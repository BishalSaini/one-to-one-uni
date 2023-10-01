package com.jsp.person.pan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavePersonPan {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vishu");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction(); 
    
    Person person=new Person(); 
	person.setName("Vishu Saini"); 
	person.setEmail("vishu@mail.com"); 
	person.setCno(12345678); 
	
	
	Pan pan=new Pan();
	pan.setAddress("Uran");
	pan.setPerson(person);
	
	
	entityTransaction.begin(); 
	entityManager.persist(person); 
	entityManager.persist(pan);
	entityTransaction.commit();//commit means Action needs to be /perform
	
}
}
