package com.nology.VenturistProxyAPI;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUserID(String userID);
}