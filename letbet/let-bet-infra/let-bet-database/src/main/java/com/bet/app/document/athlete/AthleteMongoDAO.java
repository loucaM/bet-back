package com.bet.app.document;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AthleteMongoDAO extends MongoRepository<AthleteDocument, String> {

    AthleteDocument save(AthleteDocument athleteDocument);

    List<AthleteDocument> findAll();

    @Query()
}
