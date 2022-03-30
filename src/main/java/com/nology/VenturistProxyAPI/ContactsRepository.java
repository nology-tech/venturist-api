package com.nology.VenturistProxyAPI;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactsRepository extends JpaRepository<Contacts, String> {

    Contacts findById(int id);

}
