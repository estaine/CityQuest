package com.estaine.cityquest.service;

import com.estaine.cityquest.dao.TeamDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Estaine on 15.05.2016.
 */
@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    TeamDAO teamDAO;
}
