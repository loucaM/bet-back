package com.bet.app.athlete.resource;

import com.bet.app.entity.Athlete;
import com.bet.app.entity.AthleteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/athlete", consumes = "application/json")
public class AthleteResource {

    private final AthleteRepository athleteRepository;

    public AthleteResource(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addAthlete(@RequestBody AthleteController athleteController) {
        Athlete athlete = new Athlete().setCountry(athleteController.getCountry()).setFirstname(athleteController.getFirstname()).setName(athleteController.getName());
        athleteRepository.create(athlete);
    }
}
