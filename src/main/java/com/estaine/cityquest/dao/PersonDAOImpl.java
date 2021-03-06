package com.estaine.cityquest.dao;

import com.estaine.cityquest.dao.generic.GenericDAOImpl;
import com.estaine.cityquest.entity.Person;
import org.springframework.stereotype.Repository;

/**
 * Created by Estaine on 15.04.2016.
 */
@Repository
public class PersonDAOImpl extends GenericDAOImpl<Person> implements PersonDAO {
}
