package in.sushit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.sushit.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
		SpringApplication.run(Application.class, args);
		EmployeeService service=context.getBean(EmployeeService.class);
		//service.saveEmployee();
		//service.saveMultipleEmployee();
		//service.getEmps();
		//service.getEmp();
		//service.getCount();
		//service.deleteAll();
		//service.getEmpsByDept("It");
		//service.getEmpsByGender("female");
		//service.getEmpsByDeptAndGender("civil", "female");
		service.getEmpSalaryGreaterThanEqual(17000.009);
	
	}

}
