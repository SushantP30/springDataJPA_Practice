package in.sushit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sushit.Repository.doctorRepository;
import in.sushit.service.doctorService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		doctorService service=context.getBean(doctorService.class,args);
		//service.saveDoctorInfo();
		//service.saveMultipleDoctors();
		//service.getDoctor(101);
		//service.getAllDoctors();
		//service.existById(110);
	//	service.CountOfDoctors();
		//service.DeleteById(101);
		//service.deleteAll();
		//service.getDoctorInfofindBySpecialization("Cancer");
		
		
	}

}
