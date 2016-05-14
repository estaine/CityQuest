package com.estaine.cityquest.dao;

import com.estaine.cityquest.dao.generic.GenericDAOImpl;
import com.estaine.cityquest.entity.Task;
import org.springframework.stereotype.Repository;

/**
 * Created by Estaine on 04.05.2016.
 */
@Repository
public class TaskDAOImpl extends GenericDAOImpl<Task> implements TaskDAO {
}
