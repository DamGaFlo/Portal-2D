package co.edu.escuelaing.arsw.portal2d.controller;


import co.edu.escuelaing.arsw.portal2d.model.Mapa;
import co.edu.escuelaing.arsw.portal2d.service.MapaNotFoundException;
import co.edu.escuelaing.arsw.portal2d.service.Portal2dService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/portal2d")
public class Portal2dController {
    @Autowired
    Portal2dService service;

    @GetMapping("/mapas/{name}")
    public ResponseEntity<?> getMapabyName(@PathVariable String name){
        try {
            return new ResponseEntity<>(service.getMapaByName(name), HttpStatus.ACCEPTED);
        } catch (MapaNotFoundException e) {
            Logger.getLogger(Portal2dController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/sala")
    public ResponseEntity<?> getNewSala(){
        return new ResponseEntity<>(service.getNewSala(),HttpStatus.CREATED);
    }



}
