package com.nology.VenturistProxyAPI;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {

    Users findByUserID(String userID);
}