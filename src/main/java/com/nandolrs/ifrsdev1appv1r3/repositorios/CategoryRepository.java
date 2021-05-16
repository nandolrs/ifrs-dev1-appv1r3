package com.nandolrs.ifrsdev1appv1r3.repositorios;

import org.springframework.data.repository.CrudRepository;
import com.nandolrs.ifrsdev1appv1r3.dados.Category;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}