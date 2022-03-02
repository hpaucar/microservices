package spring2crud.artifacs2crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring2crud.artifacs2crud.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
