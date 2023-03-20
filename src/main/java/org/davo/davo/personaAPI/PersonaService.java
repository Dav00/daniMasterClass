package org.davo.davo.personaAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;
    public void savePersona(PersonaDTO personaDTO) {
        var persona = mapPersonaDtoToPersona(personaDTO);
        personaRepository.save(persona);
    }

    private Persona mapPersonaDtoToPersona(PersonaDTO personaDTO) {
        return new Persona(personaDTO.getDNI(),
                personaDTO.getName());
    }
}
