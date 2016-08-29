package com.service;

import java.util.List;

import com.Cars;
import com.repository.LamborghiniRepository;

public class LamborghiniService implements CustomerService {

	LamborghiniRepository repo;

	public LamborghiniService() {
	}

	// public LamborghiniService(CarsRepository cr) {
	// repo = cr;
	// }

	@Override
	public List<Cars> findAllCars() {
		return repo.findAllCars();
	}

	public void setRepo(LamborghiniRepository repo) {
		this.repo = repo;
	}

}
