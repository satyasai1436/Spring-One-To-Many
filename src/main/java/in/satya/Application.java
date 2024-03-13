package in.satya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.satya.Service.personService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(Application.class, args);
		personService bean = context.getBean(personService.class);
		//bean.saveData();
		bean.get();
	}

}
