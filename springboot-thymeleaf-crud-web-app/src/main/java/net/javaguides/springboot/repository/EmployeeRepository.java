package net.javaguides.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	@Query(value="select e from Employee e where " +
			"concat(e.firstName, e.lastName, e.email) LIKE %?1%")
	List<Employee> findByKeyword(String Keyword);
	
	//List<Employee> findAll();
}
