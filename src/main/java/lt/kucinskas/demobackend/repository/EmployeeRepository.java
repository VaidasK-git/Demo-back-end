package lt.kucinskas.demobackend.repository;

import lt.kucinskas.demobackend.model.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}