package com.bet.app.document;

import com.bet.app.entity.Athlete;
import com.bet.app.entity.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AthleteDAO implements AthleteRepository {

    @Autowired
    MongoTemplate mongoTemplate;
    private final AthleteMongoDAO athleteMongoDAO;

    public AthleteDAO(AthleteMongoDAO athleteMongoDAO) {
        this.athleteMongoDAO = athleteMongoDAO;
    }

    @Override
    public void create(Athlete athlete) {
        athleteMongoDAO.save(AthleteMapper.toDocument(athlete));
    }
}

