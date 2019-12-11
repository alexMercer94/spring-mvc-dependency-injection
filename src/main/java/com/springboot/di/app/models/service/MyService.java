package com.springboot.di.app.models.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	public String operation() {
		return "Ejecutando algun proceso importante...";
	}

}
