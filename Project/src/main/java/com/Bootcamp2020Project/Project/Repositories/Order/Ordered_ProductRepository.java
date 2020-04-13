package com.Bootcamp2020Project.Project.Repositories.Order;

import com.Bootcamp2020Project.Project.Entities.Order.Ordered_Product;
import org.springframework.data.repository.CrudRepository;

public interface Ordered_ProductRepository extends CrudRepository<Ordered_Product,Integer> {
}
