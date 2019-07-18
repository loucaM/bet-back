package com.bet.app.athlete.resource;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class AthleteController {
    @NotNull(message = "name is absent")
    private String name;
    @NotNull(message = "first name is absent")
    private String firstname;
    @NotNull(message = "country is absent")
    private String country;
}
