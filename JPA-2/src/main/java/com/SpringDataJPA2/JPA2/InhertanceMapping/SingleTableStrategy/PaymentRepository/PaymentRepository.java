package com.SpringDataJPA2.JPA2.InhertanceMapping.SingleTableStrategy.PaymentRepository;

import com.SpringDataJPA2.JPA2.InhertanceMapping.SingleTableStrategy.Payment;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaymentRepository extends PagingAndSortingRepository<Payment,Integer> {
}
