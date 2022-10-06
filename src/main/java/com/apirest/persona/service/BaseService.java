package com.apirest.persona.service;

import com.apirest.persona.entities.Base;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public interface BaseService<E extends Base,ID extends Serializable>   {


    List<E> findAll() throws Exception;

    E findById(ID id) throws Exception;

    E save(E entity) throws Exception;

    E update(ID id, E entity) throws Exception;


    boolean delete(ID id) throws Exception;
}
