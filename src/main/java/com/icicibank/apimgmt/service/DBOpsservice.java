package com.icicibank.apimgmt.service;

import org.springframework.stereotype.Service;

import com.icicibank.apimgmt.model.Record;

@Service
public interface DBOpsservice {

	public void saveData(Record record);
}
