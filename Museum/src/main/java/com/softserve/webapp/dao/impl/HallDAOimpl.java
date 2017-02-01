package com.softserve.webapp.dao.impl;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.softserve.webapp.dao.generic.HallDAO;
import com.softserve.webapp.domain.Hall;

@Repository
@Transactional
public class HallDAOimpl extends GenericDAOImpl<Hall> implements HallDAO {
    public HallDAOimpl() {
        super(Hall.class);
    }
    
    public HallDAOimpl(Class<Hall> genericClass) {
        super(genericClass);
    }
}
