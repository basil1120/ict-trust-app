package com.digiapps.main.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.digiapps.main.entities.ResponsePayload;

@RestController
@RequestMapping("/api/v1")
public class DigiAppsController {
	
	private static final Logger logger = LoggerFactory.getLogger(DigiAppsController.class);
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	
	@PostMapping("/details")
	public ResponseEntity<?> postMethod(@RequestBody String xmldocument){
		logger.info("------------------------------ POST METHOD INVOKED ----------------------------");
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
	@GetMapping("/details")
	public ResponseEntity<ResponsePayload> getMethod(){
		logger.info("------------------------------ GET METHOD INVOKED ----------------------------");
		ResponsePayload response = new ResponsePayload();
		response.setStatusCode("S_001");
		response.setStatusDescription("Success");
		response.setAdditionalDetails("Basil Bassam");
		response.setTransactionDate(sdf.format(new Date()));
		return ResponseEntity.status(HttpStatus.OK).body(response);
	}
	
	@PostMapping("/details2")
	public ResponseEntity<?> postMethod2(@RequestBody String xmldocument){
		logger.info("------------------------------ POST-2 METHOD INVOKED ----------------------------");
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}

}
