package com.nology.VenturistProxyAPI;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TestRepository extends JpaRepository <Holding, String> {

    @Modifying
    @Query(value = "UPDATE user_data.holdings SET amount = :amount WHERE userID = :userID AND currency_code = :currencyCode", nativeQuery = true)
    void updateUserHolding(double amount, String userID, String currencyCode);
}
