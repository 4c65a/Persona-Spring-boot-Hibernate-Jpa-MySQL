package com.apirest.persona.service;


import com.apirest.persona.entities.Persona;
import com.apirest.persona.repository.BaseRepository;
import com.apirest.persona.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    public PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona,Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Persona> search(String filtro) throws Exception {
        try {
            List<Persona> persona = personaRepository.findByNombreContainigOrApellidoContainig(filtro, filtro);
            return persona;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
}
}
