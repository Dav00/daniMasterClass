package org.davo.davo.personaAPI;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
@Getter
@Setter
public class PersonaDTO {
    @NotNull(message = "DNI must be filled")
    String DNI;
    @Min(value = 3) @Max(value = 100)
    String name;
    @NotNull
    String gender;
}
