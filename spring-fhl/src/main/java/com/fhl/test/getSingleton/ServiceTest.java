package com.fhl.test.getSingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTest {

	@Autowired
	DaoTest dao;

	private String getName() {
		return dao.getName("fhl");
	}
}
