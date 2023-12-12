package in.sushit.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import in.sushit.Employee;
import in.sushit.Repo.EmployeeRepo;
import jakarta.persistence.Id;
@Service
public class EmployeeService {
private EmployeeRepo empRepo;

public EmployeeService(EmployeeRepo empRepo) {
	
	this.empRepo = empRepo;
	System.out.println(this.empRepo.getClass().getName());
}
public void saveEmployee() {
	Employee emp=new Employee();
	emp.setEmpId(102);
	emp.setEmpName("");
	emp.setEmpGender("Male");
	emp.setEmpDept("IT");
	emp.setEmpSalary(17000.90);
	empRepo.save(emp);
}
public void saveMultipleEmployee() {
	Employee emp1=new Employee();
	emp1.setEmpId(103);
	emp1.setEmpName("Ganesh");
	emp1.setEmpGender("Male");
	emp1.setEmpDept("IT");
	emp1.setEmpSalary(19000.90);
	
	Employee emp2=new Employee();
	emp2.setEmpId(104);
	emp2.setEmpName("Mangnesh");
	emp2.setEmpGender("Male");
	emp2.setEmpDept("IT");
	emp2.setEmpSalary(9000.90);
	
	Employee emp4=new Employee();
	emp4.setEmpId(105);
	emp4.setEmpName("Mukita");
	emp4.setEmpGender("Female");
	emp4.setEmpDept("civil");
	emp4.setEmpSalary(9000.90);
	
	
	
	Employee emp3=new Employee();
	emp3.setEmpId(104);
	emp3.setEmpName("Aditya");
	emp3.setEmpGender("Male");
	emp3.setEmpDept("Sales");
	emp3.setEmpSalary(9000.90);
	
	List <Employee>empList=Arrays.asList(emp1,emp2,emp3,emp4);
	empRepo.saveAll(empList);
	
}
public void getAllEmployees() {
	Iterable<Employee> findAll=empRepo.findAll();
	findAll.forEach(System.out::println);

}
public void getEmps() {
	List<Integer> empIds=Arrays.asList(102,103);
	Iterable<Employee> itr=empRepo.findAllById(empIds);
	itr.forEach(System.out::println);
}
public void getEmp() {
	Optional <Employee> findById=empRepo.findById(101);
	if(findById.isPresent()) {
		Employee employee=findById.get();
	System.out.println(employee);
	}
}
public void getCount() {
	long emp=empRepo.count();
	System.out.println(emp);
}
public void deleteById(Integer id) {
	
	empRepo.deleteById(id);
}
public void deleteAll() {
	empRepo.deleteAll();
}
public void delete(Employee emp) {
	empRepo.delete(emp);
}
public void getEmpsByDept(String dept) {
	List<Employee> emps=empRepo.findByEmpDept(dept);
	emps.forEach(System.out::println);
}
public void getEmpsByGender(String gender) {
	List<Employee> emps=empRepo.findByEmpGender(gender);
	emps.forEach(System.out::println);
}

public void getEmpsByDeptAndGender(String dept, String gender) {
	// TODO Auto-generated method stub
	List<Employee> emps=empRepo.findByEmpDeptAndEmpGender(dept,gender);
	emps.forEach(System.out::println);
}
public void getEmpSalaryGreaterThanEqual(Double empSalary) {
	List<Employee> emps=empRepo.findByEmpSalaryGreaterThanEqual(empSalary);
	emps.forEach(System.out::println);
}

}
