package com.estaine.cityquest.service;

import com.estaine.cityquest.dao.SubtaskDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Estaine on 15.05.2016.
 */
@Service
public class SubtaskServiceImpl implements SubtaskService {
    @Autowired
    SubtaskDAO subtaskDAO;
}
