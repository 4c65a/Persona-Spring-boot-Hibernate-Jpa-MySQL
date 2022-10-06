package com.apirest.persona.controller;

import com.apirest.persona.entities.Localidad;
import com.apirest.persona.service.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidad")
public class LocalidadController extends  BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
