package com.example.algamoneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
