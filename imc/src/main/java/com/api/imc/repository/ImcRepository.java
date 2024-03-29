package com.api.imc.repository;

import com.api.imc.model.Imc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImcRepository extends JpaRepository<Imc, Integer>{
}
