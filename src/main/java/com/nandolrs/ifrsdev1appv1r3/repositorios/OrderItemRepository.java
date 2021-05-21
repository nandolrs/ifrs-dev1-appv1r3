package com.nandolrs.ifrsdev1appv1r3.repositorios;

import com.nandolrs.ifrsdev1appv1r3.dados.OrderItem;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItem, Integer> {

}