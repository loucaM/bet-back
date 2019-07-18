package com.bet.app.document;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.Repository;

public interface AthleteMongoDAO extends MongoRepository<AthleteDocument, String> {

    AthleteDocument save(AthleteDocument athleteDocument);
}
