package com.Bootcamp2020Project.Project.Repositories.Product;

import com.Bootcamp2020Project.Project.Entities.Product.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
