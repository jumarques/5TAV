package com.faeterj.tav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faeterj.tav.model.ClienteMD;

@Repository
public interface ClienteRP   extends  JpaRepository< ClienteMD, Integer>{

}
