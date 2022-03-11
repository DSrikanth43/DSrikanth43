package com.zensar.training.db;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.zensar.olx.training.bean.LoginUser;
import com.zensar.olx.training.bean.OlxUser;
@SuppressWarnings("unused")
@Repository
public interface OlxUserDAO extends JpaRepository<OlxUserDAO,Integer>{
OlxUserDAO findByUserName(String userName);

}
