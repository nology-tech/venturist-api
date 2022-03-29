package com.nology.VenturistProxyAPI;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Qualifier("Holdings")
@Repository
public interface HoldingRepository extends JpaRepository<Holding, String> {

    Holding findByHoldingID(int holdingID);

}
