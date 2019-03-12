package com.citibanamex.api.bne.saveremoteauthorization.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.citibanamex.api.bne.saveremoteauthorization.beans.model;

public interface accountsRepository extends CrudRepository<model, Long> {
    
    List<model> findByAccount(Long account);
    
}
