package com.alp2.spring_boot_library.dao;


import com.alp2.spring_boot_library.Entity.Checkout;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CheckoutRepository extends JpaRepository<Checkout, Long> {
    Checkout findByUserEmailAndBookId(String userEmail, Long bookId);

    List<Checkout> findBooksByUserEmail(String userEmail);
}
