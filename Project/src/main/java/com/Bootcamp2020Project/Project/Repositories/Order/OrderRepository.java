package com.Bootcamp2020Project.Project.Repositories.Order;

import com.Bootcamp2020Project.Project.Entities.Order.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order,Integer> {
}
