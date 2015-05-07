package com.gmail.waohao;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gmail.waohao.model.Demo;
import com.gmail.waohao.service.DemoService;

public class MyBatisWithSpringConfig {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "Spring-all-config.xml" });
		DemoService service = context.getBean(DemoService.class);
		List<Demo> results = service.findById(1L);
		System.out.println("size:");
		System.out.println(results.size());
		context.close();
	}
}
