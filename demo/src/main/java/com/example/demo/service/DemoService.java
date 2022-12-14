package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Isolation;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.DemoDAOInterface;
import com.example.demo.entity.Employee;

@Service
//@Component
//@Transactional(isolation = Isolation.SERIALIZABLE,timeout = 3000,propagation = Propagation.MANDATORY)
public class DemoService implements DemoServiceInterface {

	//@Autowired
	//private DemoDAOInterface dDao;
	
	@Override
	public String displayService() {
		Employee emp=new Employee();
		//boolean b=dDao.loginEmp(emp.getEmpId(),emp.getEmpPassword());
		return "i am service";
	}

}
