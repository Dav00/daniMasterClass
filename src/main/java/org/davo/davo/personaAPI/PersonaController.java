package org.davo.davo.personaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @PostMapping("/")
    ResponseEntity<String> createPersonaMethod(@RequestBody PersonaDTO personaDTO){
        //Primero validamos la peticion con la libreria javax validation
        personaService.savePersona(personaDTO);
        return ResponseEntity.ok("Persona created succcesfully");
    }
}
