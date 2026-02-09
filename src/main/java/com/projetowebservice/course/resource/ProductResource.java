package com.projetowebservice.course.resource;

import com.projetowebservice.course.entities.Products;
import com.projetowebservice.course.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Products>> findAll(){

        List<Products> list = service.findAll();

        return ResponseEntity.ok().body(list);
   }

   @GetMapping(value = "/{id}")
    public ResponseEntity<Products> findById(@PathVariable Long id){

        Products obj = service.findById(id);
        return ResponseEntity.ok().body(obj);

    }
}
