package in.sushit.Repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import in.sushit.Employee;

public interface EmployeeRepo extends CrudRepository<Employee,Integer>{

	public List<Employee> findByEmpDept(String dept);
	public List<Employee> findByEmpGender (String empGender);
	public List<Employee> findByEmpDeptAndEmpGender(String empDept,String empGender);
	public List<Employee> findByEmpSalaryGreaterThanEqual(Double empSalary);
}
