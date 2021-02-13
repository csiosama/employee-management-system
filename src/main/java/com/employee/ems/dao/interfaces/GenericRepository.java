package com.employee.ems.dao.interfaces;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface GenericRepository<T> {

    public List<T> getAllEntities(Class<T> projectClass);

    public T getEntityById(Class<T> projectClass, String id);

    public Optional<Serializable> insertEntity(T entityObject);

    public boolean updateEntity(String entityId, T updatedEntityObject);

    public boolean deleteEntity(Class<T> entityClass, String entityId);

}
