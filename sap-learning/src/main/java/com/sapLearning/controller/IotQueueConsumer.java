package com.sapLearning.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sapLearning.model.MeasurementDocumentModel;

@RestController
public class IotQueueConsumer {
	
	
	public void postTimeSeriesData()
	{
		MeasurementDocumentModel data=new MeasurementDocumentModel();
		
	}

}
