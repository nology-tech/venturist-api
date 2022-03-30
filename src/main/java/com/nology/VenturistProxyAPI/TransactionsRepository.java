package com.nology.VenturistProxyAPI;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<Transaction, String> {
}
