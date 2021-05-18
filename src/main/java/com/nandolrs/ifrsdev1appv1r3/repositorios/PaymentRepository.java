package com.nandolrs.ifrsdev1appv1r3.repositorios;

import com.nandolrs.ifrsdev1appv1r3.dados.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}