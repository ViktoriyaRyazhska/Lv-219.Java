package com.softserve.edu.dao.impl;

import com.softserve.edu.dao.ClientTourDao;
import com.softserve.edu.domain.ClientTour;

public class ClientTourDaoImpl extends GenericDaoImpl<ClientTour> implements ClientTourDao {

    public ClientTourDaoImpl() {
        super(ClientTour.class);
    }

    public ClientTourDaoImpl(Class<ClientTour> genericClass) {
        super(genericClass);

    }

}
