package com.tecsoluction.sofia.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "evento")
public class EventoControllerRest  {

 //  private final EventoServicoImpl userService;


//    @Autowired
//    public EventoControllerRest(EventoServicoImpl dao) {
//        this.userService = dao;
//    }

//    @Override
//    protected EventoServicoImpl getservice() {
//        // TODO Auto-generated method stub
//        return userService;
//    }
    
//    @RequestMapping(value = "/listar/", method = RequestMethod.GET)
//    public @ResponseBody List<Evento> listarEventos() {
//
//        return null;
//
//    }
   
//    @RequestMapping(value = "/salvar/", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
//    public @ResponseBody List<Evento> salvarEventos(@RequestBody List<Evento> eventos) {
//    	
//    	System.out.println(eventos.toString());
//    	
//    	for (Evento evento : eventos) {
//    		
//    		getservice().save(evento);
//			
//		}
//    	
//    	
//        return eventos;
//
//    }


}
