package com.gmail.waohao.service;

import java.util.List;

import com.gmail.waohao.model.Demo;

public interface DemoService {
	List<Demo> findById(Long id);
}
