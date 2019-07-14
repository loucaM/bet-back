package com.bet.app.document;

import com.bet.app.entity.Athlete;

public class AthleteMapper {

    static Athlete toEntity(AthleteDocument athleteDocument) {
        return new Athlete().setName(athleteDocument.getName()).setFirstname(athleteDocument.getFirstname()).setCountry(athleteDocument.getCountry()).setReactionTime(athleteDocument.getReactionTime());
    }

    static AthleteDocument toDocument(Athlete athlete) {
        return new AthleteDocument().setCountry(athlete.getCountry()).setFirstname(athlete.getFirstname()).setName(athlete.getName()).setCountry(athlete.getCountry()).setReactionTime(athlete.getReactionTime());
    }
}
