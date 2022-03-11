package com.zensar.training.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olx. training.bean.AdvertisementStatus;
import com.zensar.olx.training.service.AdivertisementStatusService;

@RestController
public class AdvertisementStatusController {

	@Autowired
	AdivertisementStatusService service;

	@PostMapping("/advertise/add")
	public AdvertisementStatusController addAdvertisementStatus(@RequestBody AdvertisementStatusController advertisementStatus) {
		return this.service.addAdvertisementStatus(advertisementStatus);
	}

	@GetMapping("/advertise/status")
	public List<AdvertisementStatus> getAdvertisementStatus() {
		return this.service.getAdvertisementStatus();
	}
	
	@GetMapping("/advertisementStatus/getStatus/{id}")
	public AdvertisementStatusController getAdvertisementStatus(@PathVariable(name = "id") int id) {
		return this.service.findAdvertisementStatus(id);
	}

}