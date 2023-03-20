package org.davo.davo.firstAPI;

import lombok.*;

import javax.validation.constraints.NotNull;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class NameDTO {
    @NotNull(message = "Invalid payload please send a valid name.")
    String name;

}