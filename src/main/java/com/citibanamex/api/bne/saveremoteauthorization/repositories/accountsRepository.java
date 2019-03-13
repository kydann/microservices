package com.citibanamex.api.bne.saveremoteauthorization.repositories;

import java.util.List;
import com.citibanamex.api.bne.saveremoteauthorization.beans.model;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

@Repository
@Transactional
public class accountsRepository {
    @Autowired
    private EntityManager mod;
    
    public List<model> getAll() {
        Query query = mod.createQuery("SELECT u FROM model u");
        List<model> usuarios = query.getResultList();
        return usuarios;
    }
    
}
