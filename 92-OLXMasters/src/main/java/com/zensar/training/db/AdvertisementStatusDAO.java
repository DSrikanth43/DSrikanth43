package com.zensar.training.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.olx.training.bean.AdvertisementStatus;

@Repository
public interface AdvertisementStatusDAO extends JpaRepository<AdvertisementStatus, Integer>{

}
