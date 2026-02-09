package com.projetowebservice.course.repositories;

import com.projetowebservice.course.entities.Category;
import com.projetowebservice.course.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositories extends JpaRepository<Products, Long> {


}
