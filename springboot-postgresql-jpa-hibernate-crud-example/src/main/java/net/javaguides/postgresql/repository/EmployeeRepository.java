package net.javaguides.postgresql.repository;


import net.javaguides.postgresql.model.CustomLoginModel;
import net.javaguides.postgresql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	@Query(value = "select  u  from Employee  u where u.emailId=?1 and u.password=?2")
	public Employee getdetailsbyEmailIdandpassword(@Param("emailId") String emailId,
			@Param("password") String password);
}
