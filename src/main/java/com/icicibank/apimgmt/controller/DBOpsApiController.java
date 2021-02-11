package com.icicibank.apimgmt.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icicibank.apimgmt.model.Record;
import com.icicibank.apimgmt.service.DBOpsservice;

@RestController
@RequestMapping("/api/v0")
public class DBOpsApiController {

	Logger logger = LoggerFactory.getLogger(DBOpsApiController.class);
	
	@Autowired
	DBOpsservice service;
	
	@PostMapping(value="/saveRecord",consumes="application/json",produces="text/plain")
	public ResponseEntity<String> saveRecord(@RequestBody Record record){
	
		logger.info(record.toString());
		service.saveData(record);
		return ResponseEntity.ok().body("success");
	}
	
}
