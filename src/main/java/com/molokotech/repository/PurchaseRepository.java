package com.molokotech.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;
import com.molokotech.model.Purchase;

public interface PurchaseRepository extends JpaRepository<Purchase, Long>{

}
