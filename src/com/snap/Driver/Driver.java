package com.snap.Driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.snap.dao.AssessmentDao;
import com.snap.models.Assessment;

public class Driver {//testing DAO
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		AssessmentDao dao=(AssessmentDao)context.getBean("AssessmentDaoBean",AssessmentDao.class);
		
		//insertion logic here
		  
	}
}
