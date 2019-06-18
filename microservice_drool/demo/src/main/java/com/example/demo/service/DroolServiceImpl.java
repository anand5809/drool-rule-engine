package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.Employee;
import com.example.demo.pojo.TicketPojo;

@Service
public class DroolServiceImpl implements DroolService {

	@Autowired
	private  KieContainer kieContainer;
	
	@Override
	public List<TicketPojo> getRuleBasedData() {
		
		List<Employee> d1= new ArrayList<Employee>();
		Employee p=new Employee();
		p.setDeparment("cse");
		p.setPriority(1);
		p.setEmpId(111);
		p.setLocation("Noida");
		p.setName("Anand");
		Employee p1=new Employee();
		p1.setDeparment("test");
		p1.setPriority(2);
		p1.setEmpId(222);
		p1.setLocation("Noida");
		p1.setName("Prakash");
		Employee p2=new Employee();
		p1.setDeparment("test");
		p1.setPriority(3);
		p1.setEmpId(222);
		p1.setLocation("Noida");
		p1.setName("JHAKASHHHHHHHHH");
		d1.add(p);
		d1.add(p1);
		
		List<TicketPojo> t=new ArrayList<TicketPojo>();
		TicketPojo tt=new TicketPojo();
		tt.setTicketid(12);
		tt.setLocation("Noida");
		tt.setDepartment("cse");
		TicketPojo tt1=new TicketPojo();
		tt1.setTicketid(12);
		tt1.setLocation("Delhi");
		tt1.setDepartment("cse");
		t.add(tt);
		t.add(tt1);
		
		List<TicketPojo> returnAssignee=new ArrayList<TicketPojo>();
		
		for (TicketPojo ticketPojo : t) {
			if(ticketPojo.getAssigned()==null) {
			ticketPojo.setEmpList(d1);
			KieSession kieSession = kieContainer.newKieSession("rulesSession");
			kieSession.insert(ticketPojo);
			kieSession.fireAllRules();
			kieSession.dispose();
			returnAssignee.add(ticketPojo);
			}
			
		}
		
		
		
		return  returnAssignee;
	}

}
