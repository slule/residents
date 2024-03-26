/**  
* @Author Shalom Lule - slule@dmacc.edu  
* CIS175 <Spring 2024>
* Mar 24, 2024 
*/ 
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Resident;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Resident resident() {
		Resident bean = new Resident();
		bean.setFirstName("Fifa");
		bean.setLastName("Good");
		bean.setApartmentNumber(2024);
		
		return bean;
		
	}
	
	

}
