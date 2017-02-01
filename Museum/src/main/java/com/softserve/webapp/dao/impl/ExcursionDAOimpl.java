package com.softserve.webapp.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.softserve.webapp.dao.generic.ExcursionDAO;
import com.softserve.webapp.domain.Excursion;

@Repository
@Transactional
public class ExcursionDAOimpl extends GenericDAOImpl<Excursion> implements ExcursionDAO {
    public ExcursionDAOimpl() {
        super(Excursion.class);
    }
    
    public ExcursionDAOimpl(Class<Excursion> genericClass) {
        super(genericClass);
    }    
   
}
