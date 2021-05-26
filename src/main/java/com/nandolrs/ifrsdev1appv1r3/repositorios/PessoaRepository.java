package com.nandolrs.ifrsdev1appv1r3.repositorios;

import com.nandolrs.ifrsdev1appv1r3.dados.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

}