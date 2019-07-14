package com.bet.app.document;

import com.bet.app.entity.Athlete;
import com.bet.app.entity.AthleteRepository;
import org.springframework.stereotype.Repository;

@Repository
public class AthleteDAO implements AthleteRepository {

    private final AthletePostgresRepository athletePostgresRepository;

    public AthleteDAO(AthletePostgresRepository athletePostgresRepository) {
        this.athletePostgresRepository = athletePostgresRepository;
    }

    @Override
    public void create(Athlete athlete) {
        athletePostgresRepository.save(AthleteMapper.toDocument(athlete));
    }
}

