package com.example.demo.dao;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface DemoDAOInterface {//extends JpaRepository<Employee, String>{

	//@Query("from com.example.demo.entity.Employee e where e.empId=:uid and e.empPassword=:upass")
	//boolean loginEmp(@Param("uid") String empId, @Param("upass") String empPassword);

}
