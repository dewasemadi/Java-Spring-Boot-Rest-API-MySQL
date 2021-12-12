package com.restapi.models.repository;

import java.util.List;

import com.restapi.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

// CrudRepository berisi method-method yang otomatis bisa kita pakai untuk operasi CRUD
public interface ProductRepo extends CrudRepository<Product, Long> {

    // costume method
    List<Product> findByNameContains(String name);
}
