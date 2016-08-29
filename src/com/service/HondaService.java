package com.service;

import java.util.List;

import com.Cars;
import com.repository.HondaRepository;

public class HondaService implements CustomerService {

	HondaRepository HondaRepository;
	
	public void setHondaRepository(HondaRepository hondaRepository) {
		this.HondaRepository = hondaRepository;
	}

	@Override
	public List<Cars> findAllCars() {
		return HondaRepository.findAllCars();
	}

}
