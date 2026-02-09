package com.projetowebservice.course.service;

import com.projetowebservice.course.entities.Products;
import com.projetowebservice.course.repositories.ProductRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepositories repositories;

    public List<Products> findAll(){
        return repositories.findAll();
    }
    public Products findById(Long id ){
        Optional<Products> obj = repositories.findById(id);
        return obj.get();
    }
}
