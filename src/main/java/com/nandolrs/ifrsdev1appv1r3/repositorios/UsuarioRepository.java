package com.nandolrs.ifrsdev1appv1r3.repositorios;

import com.nandolrs.ifrsdev1appv1r3.dados.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}