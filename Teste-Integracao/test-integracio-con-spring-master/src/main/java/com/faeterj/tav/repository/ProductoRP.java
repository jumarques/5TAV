package com.faeterj.tav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faeterj.tav.model.ProductoMD;

@Repository
public interface ProductoRP  extends  JpaRepository< ProductoMD, Integer>{

}
