package com.example.akinobank.dao;

import com.example.akinobank.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte , String> {
}
