package com.ubsdigital.source.models.repository;

import com.ubsdigital.source.models.domain.Medico;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {
}