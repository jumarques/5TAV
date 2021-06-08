package com.faeterj.tav.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.faeterj.tav.model.GarantiaExtendidaMD;

@Repository
public interface GarantiaExtendidaRP  extends  JpaRepository<GarantiaExtendidaMD, Integer> {

}
