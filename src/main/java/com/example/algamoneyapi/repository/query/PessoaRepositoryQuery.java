package com.example.algamoneyapi.repository.query;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.algamoneyapi.model.Pessoa;
import com.example.algamoneyapi.repository.filter.PessoaFilter;

public interface PessoaRepositoryQuery {

	public Page<Pessoa> consultarPessoa(PessoaFilter pessoaFilter, Pageable pageable);

}
