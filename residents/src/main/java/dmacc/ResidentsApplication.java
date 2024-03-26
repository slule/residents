package dmacc;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import dmacc.beans.Resident;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.ResidentRepository;

@SpringBootApplication
public class ResidentsApplication implements CommandLineRunner {
	
	@Autowired
	ResidentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(ResidentsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Resident resident = new Resident();
		System.out.println("Enter First Name: ");
		Scanner in = new Scanner (System.in);
		resident.setFirstName(in.nextLine());
		
		System.out.println("Enter Last Name: ");
		resident.setLastName(in.nextLine());
		
		System.out.println("Enter Apartment Number: ");
		resident.setApartmentNumber(in.nextInt());
		
		repo.save(resident);
		
		List<Resident> rList = repo.findAll();
		for (Resident r: rList) {
			System.out.println(r.getFirstName());
			System.out.println(r.getLastName());
			System.out.println(r.getApartmentNumber());
		}
		
	}
	
	
}
