package com.estaine.cityquest.service;

import com.estaine.cityquest.dao.MarkDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Estaine on 15.05.2016.
 */
@Service
public class MarkServiceImpl implements MarkService {
    @Autowired
    MarkDAO markDAO;
}
