package com.estaine.cityquest.service;

import com.estaine.cityquest.dao.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Estaine on 15.05.2016.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDAO personDAO;
}
