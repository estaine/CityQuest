package com.estaine.cityquest.service;

import com.estaine.cityquest.dao.ImageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Estaine on 15.05.2016.
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageDAO imageDAO;
}
