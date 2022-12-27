package com.masai.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.app.entity.Collage;
import com.masai.app.entity.Student;
import com.masai.app.utils.EmUtils;

public class App {

	public static void main(String[] args) {
		EntityManager em=EmUtils.provideEntityManager();
		
		System.out.println("Tables have been created");
		
		/**Collage c1=new Collage();
	
		c1.setCollageName("Vit");
		c1.setCollageAddress("Tamil Nadu");
		
		Collage c2=new Collage();
		
		c2.setCollageName("Delhi University");
		c2.setCollageAddress("Delhi");
		
		//s1,s2,s3,s4 belongs to c1 collage
		Student s1=new Student();
	
		s1.setStudentName("Shilp");
		s1.setEmail("shilp@gmail.com");
		
		
		
		Student s2=new Student();
		
		s2.setStudentName("Isha");
		s2.setEmail("Isha@gmail.com");
		s2.setMobileNumber("9375499973");
		
		
		Student s3=new Student();
		
		s3.setStudentName("Harsh");
		s3.setEmail("harsh@gmail.com");
		s3.setMobileNumber("9375499774");
		
		
		Student s4=new Student();
	
		s4.setStudentName("Utkarsh");
		s4.setEmail("utkarsh@gmail.com");
		s4.setMobileNumber("9375899974");
		s4.setCollage(c1);
		
		//s5,s6,s7,s8 belongs to c2
		Student s5=new Student();
	
		s5.setStudentName("Simran");
		s5.setEmail("simran@gmail.com");
		s5.setMobileNumber("8375499974");
	
		
		Student s6=new Student();
	
		s6.setStudentName("Dhananjay");
		s6.setEmail("dhananjay@gmail.com");
		s6.setMobileNumber("9370499974");
		s6.setCollage(c2);
		
		Student s7=new Student();
		
		s7.setStudentName("Revant");
		s7.setEmail("revant@gmail.com");
		s1.setMobileNumber("9305499974");
	
		
		Student s8=new Student();
		
		s8.setStudentName("Dhairya");
		s8.setEmail("dhairya@gmail.com");
		s8.setMobileNumber("9475499974");
		
		s1.setCollage(c1);
		s2.setCollage(c1);
		s3.setCollage(c1);
		s4.setCollage(c1);
		s5.setCollage(c2);
		s6.setCollage(c2);
		s7.setCollage(c2);
		s8.setCollage(c2);
		
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		c1.getStudents().add(s3);
		c1.getStudents().add(s4);
		
		c2.getStudents().add(s5);
		c2.getStudents().add(s6);
		c2.getStudents().add(s7);
		c2.getStudents().add(s8);
		
	
		
		em.getTransaction().begin();
		em.persist(c1);
		em.persist(c2);
	
		System.out.print("Item are saved successfully");
		em.getTransaction().commit();**/
		
		/** get all students based on a college Id **/
		/**String jpql="select c.students from Collage c where c.collageId=:collageId";
		Query query=em.createQuery(jpql);
		query.setParameter("collageId",21);
		List<Student> students=query.getResultList();
		Collage collage = em.find(Collage.class, query.getParameterValue("collageId"));
		System.out.println(collage.getCollageId()+" "+collage.getCollageName()+" students");
		for(Student s:students) {
			System.out.println(s.getStudentRoll()+" "+s.getStudentName());
		}**/
		
		
		/**get collage details based on student roll no**/
		
		/**String jpql="select s.collage from Student s where s.studentRoll=:id";
		Query query=em.createQuery(jpql);
		query.setParameter("id", 19);
		Student student=em.find(Student.class,query.getParameterValue("id"));
		Collage collage=(Collage)query.getSingleResult();
		System.out.println(student.getStudentName()+" studies in "+collage.getCollageName()
		+" which is located in "+collage.getCollageAddress()); **/
		
	}

}
