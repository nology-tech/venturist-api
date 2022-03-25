package com.nology.VenturistProxyAPI;
import com.google.api.services.sqladmin.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findById(int id);
    String deleteById(int id);
}