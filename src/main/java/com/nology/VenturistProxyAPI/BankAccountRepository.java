package com.nology.VenturistProxyAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BankAccountRepository extends JpaRepository <BankAccount, String>{

    BankAccount findById(int id);

    @Query(value = "SELECT * FROM bankAccounts WHERE userID = :userID", nativeQuery = true)
    List<BankAccount> findAllByUserID(String userID);
}
