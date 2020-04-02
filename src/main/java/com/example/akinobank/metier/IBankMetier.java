package com.example.akinobank.metier;

import com.example.akinobank.entities.Compte;
import com.example.akinobank.entities.Operation;
import org.springframework.data.domain.Page;

import java.util.Optional;

public interface IBankMetier {

    public Optional<Compte> consulterCompter(String codeCpte);
    public void verser(String codeCpte , double montant);
    public void reterait(String codeCpte , double montant);
    public void verement(String codeCpte1 , String codeCpte2 , double montant);
    public Page<Operation> listOperation(String codeCpte , int page , int size);
    Optional<Compte> findById(String id);

}
