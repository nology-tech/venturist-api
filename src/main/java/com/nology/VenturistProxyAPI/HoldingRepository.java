package com.nology.VenturistProxyAPI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HoldingRepository extends JpaRepository<Holding, String> {

    @Query(value = "SELECT * FROM holdings WHERE userID = ?1", nativeQuery = true)
    List<Holding> findAllHoldingByUserID(@Param("id") String id);

    Holding findById(int id);

}
