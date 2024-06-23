package com.itboy.DACNPM.repositories;

import com.itboy.DACNPM.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    public Payment findPaymentByName(String name);
}
