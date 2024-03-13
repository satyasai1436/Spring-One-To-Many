package in.satya.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satya.Entity.Person;
import in.satya.Entity.address1;
import in.satya.Repo.address1Repo;
import in.satya.Repo.personRepo;

@Service
public class personService {
	@Autowired
	private personRepo pRepo;
	@Autowired
	private address1Repo aRepo;
	
	
	public void get() {
		Optional<Person> id = pRepo.findById(1);
		if(id.isPresent()) {
			Person person = id.get();
			List<address1> listaddress = person.getAddress();
			listaddress.forEach(System.out::println);
			
		}
	}
	
	public void saveData() {
		Person p=new Person();
		p.setpName("Sesha Giri");
		p.setpSalary(20000.1);
		
		
		
		
		address1 a=new address1();
		a.setaVillage("Gummuluru");
		a.setaMandal("Akiveedu");
		a.setaState("Andhra Pradesh");
		
		
		address1 a1=new address1();
		a1.setaVillage("S.R Nagar");
		a1.setaMandal("Secunderabad");
		a1.setaState("Telangana");
		List<address1> list = Arrays.asList(a,a1);
		
		
		//Association
		a.setPerson(p);
		a1.setPerson(p);
		p.setAddress(list);
		
		
		pRepo.save(p);
		
		
		
		
		
		
	
		
		
	}
	
	
	

}
