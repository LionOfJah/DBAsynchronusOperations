package com.icicibank.apimgmt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.icicibank.apimgmt.model.Record;

@Repository
public interface DBOpsRepository extends CrudRepository<Record, Long> {

	@Async
	public Record save(Record record);
}
