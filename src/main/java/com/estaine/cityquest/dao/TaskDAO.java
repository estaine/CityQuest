package com.estaine.cityquest.dao;

import com.estaine.cityquest.dao.generic.GenericDAO;
import com.estaine.cityquest.entity.Task;
import org.springframework.stereotype.Repository;

/**
 * Created by Estaine on 04.05.2016.
 */
@Repository
public interface TaskDAO extends GenericDAO<Task> {
}
