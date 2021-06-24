package com.icicibank.apimgmt.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.icicibank.apimgmt.dao.DBOpsRepository;
import com.icicibank.apimgmt.model.Record;
import com.icicibank.apimgmt.service.DBOpsservice;

@Service
public class DBOpsServiceImpl implements DBOpsservice {

	Logger logger = LoggerFactory.getLogger(DBOpsServiceImpl.class);

	@Autowired
	DBOpsRepository repository;

	@Override
	@Async
	public void saveData(Record record) {
		logger.info("saving data");
		repository.save(record);

	}

}
