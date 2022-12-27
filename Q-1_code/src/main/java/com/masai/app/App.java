package com.masai.app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.app.entity.Address;
import com.masai.app.entity.Customer;
import com.masai.app.utils.EmUtils;

public class App {

	public static void main(String[] args) {
		/** let us run the entitymanager object to create the tables automatically **/
		
		EntityManager em=EmUtils.provideEntityManager();
		
		/**Create 2 customer objs and each of them should have two addresses office and home**/
		/** we are assuming that the home address of customer1 and customer2 is same to provide a good
		  of many to many
		 */
		
		/**let us add these two customers and their addresses in each other's list and then
		in the database **/
		
		/**Customer cust1=new Customer();
		Customer cust2=new Customer();
		
		
		cust1.setName("Shilp");
		cust1.setEmail("shilppatel77@gmail.com");
		cust1.setMobileNumber("9375499974");
		
	
		cust2.setName("Isha");
		cust2.setEmail("Isha@gmail.com");
		cust2.setMobileNumber("7668765352");
		
		
		
		
		Address office_address1=new Address();
		Address office_address2=new Address();
		Address home_address=new Address();
		
	
		office_address1.setState("Delhi");
		office_address1.setCity("Sarojini");
		office_address1.setPincode("380007");
		
		
		office_address2.setState("Meerut");
		office_address2.setCity("Mawana");
		office_address2.setPincode("390007");

		home_address.setState("Gujarat");
		home_address.setCity("Ahmedabad");
		home_address.setPincode("380008");
		
		
		
		
		
		office_address1.getCustomers().add(cust1);
		office_address2.getCustomers().add(cust2);
		home_address.getCustomers().add(cust1);
		home_address.getCustomers().add(cust2); 
	
		cust1.getAddresses().add(office_address1);
		cust1.getAddresses().add(home_address);
		cust2.getAddresses().add(office_address2);
		cust2.getAddresses().add(home_address);
		
		
		
		
		em.getTransaction().begin();
		em.persist(office_address1);
		em.persist(office_address2);
		em.persist(home_address);
		
		em.getTransaction().commit(); **/
		System.out.println("Customers are saved and also their corresponding addresses");
		
		/** get all addresses of a customer based on Cid **/
		String jpql = "select c.addresses from Customer c where c.cid=:cid";
		Query query=em.createQuery(jpql);
		query.setParameter("cid",2);
		List<Address> cid_addresses=query.getResultList();
		Customer customer=em.find(Customer.class, 2);
		System.out.println(customer.getCid()+" "+customer.getName());
		for(Address addr:cid_addresses) {
			System.out.println(addr.getId()+" "+addr.getState()+" "+addr.getCity()
			+" "+addr.getPincode());
		}
		
	
		

	}

}
