package com.estaine.cityquest.dao.generic;

/**
 * Created by Estaine on 15.04.2016.
 */
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface GenericDAO<ModelObject> {
    int create(ModelObject modelObject);

    ModelObject get(int id);

    void update(ModelObject modelObject);

    void delete(ModelObject modelObject);

    List<ModelObject> listByProperty(String propertyName, Object propertyValue);

    List<ModelObject> listByProperties(Map<String, Object> properties);

    ModelObject getByProperty(String propertyName, Object propertyValue);

    ModelObject getByProperties(Map<String, Object> properties);

    List<ModelObject> getAll();
}
