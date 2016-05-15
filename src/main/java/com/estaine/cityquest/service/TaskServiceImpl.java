package com.estaine.cityquest.service;

import com.estaine.cityquest.dao.TaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Estaine on 15.05.2016.
 */
@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskDAO taskDAO;
}
