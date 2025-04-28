package com.mycompany.alocacao_veiculos.model.dao;

import java.util.List;
import java.util.Optional;

public interface Dao<Entity, IdType> {
    
    Optional<Entity> get(IdType id);
    
    List<Entity> getAll();
    
    void save(Entity entity);
    
    void update(Entity entity, String[] params);
    
    void delete(IdType id);
}