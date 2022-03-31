package com.nology.VenturistProxyAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts, String> {

    Contacts findById(int id);

    @Query(value = "SELECT * FROM contacts WHERE userID = ?1", nativeQuery = true)
    List<Contacts> findAllContactsByUserID(String id);

    void deleteById(int id);

}
