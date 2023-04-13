package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;

import net.javaguides.springboot.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	
	public List<Employee> findByKeyWord(String keyword);
	
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
	//List<Employee> getAllEmployees(String keyword);
}
