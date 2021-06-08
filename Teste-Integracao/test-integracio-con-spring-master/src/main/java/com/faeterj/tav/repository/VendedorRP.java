package com.faeterj.tav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faeterj.tav.model.VendedorMD;

@Repository
public interface VendedorRP  extends  JpaRepository<VendedorMD, Integer> {

}
