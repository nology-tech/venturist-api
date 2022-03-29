package com.nology.VenturistProxyAPI;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

//@Qualifier("User")
@Repository
public interface UserRepository extends JpaRepository<Users, String> {

    Users findByUserID(String userID);
}