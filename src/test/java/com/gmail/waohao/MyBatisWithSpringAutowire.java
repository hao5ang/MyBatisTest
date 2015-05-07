package com.gmail.waohao;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.gmail.waohao.service.DemoService;

//@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-autowire.xml")
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class MyBatisWithSpringAutowire {
	@Autowired
	private DemoService demoService;

	@Before
	public void prepare() {
	}

	@After
	public void cleanUp() {
	}

	@Test
	public void justTry() {
		System.out.println(demoService.findById(1L));
	}
}
