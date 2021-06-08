package com.faeterj.tav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faeterj.tav.model.VentaMD;

@Repository
public interface VentaRP extends  JpaRepository< VentaMD, Integer> {

}
