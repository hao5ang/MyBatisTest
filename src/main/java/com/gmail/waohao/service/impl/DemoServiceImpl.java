package com.gmail.waohao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gmail.waohao.mapper.DemoMapper;
import com.gmail.waohao.model.Demo;
import com.gmail.waohao.model.DemoExample;
import com.gmail.waohao.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoMapper demoMapper;

	public List<Demo> findById(Long id) {
		if (id == null) {
			return null;
		}
		DemoExample example = new DemoExample();
		DemoExample.Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id);
		return demoMapper.selectByExample(example);
	}

	public DemoMapper getDemoMapper() {
		return demoMapper;
	}

	public void setDemoMapper(DemoMapper demoMapper) {
		this.demoMapper = demoMapper;
	}

}
