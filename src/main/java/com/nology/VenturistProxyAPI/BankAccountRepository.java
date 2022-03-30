package com.nology.VenturistProxyAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository <BankAccount, String>{

    BankAccount findById(int id);
}
