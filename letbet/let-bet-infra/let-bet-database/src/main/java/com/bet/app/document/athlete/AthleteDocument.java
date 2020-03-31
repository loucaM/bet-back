package com.bet.app.document;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Data
@Accessors(chain = true)
@Document(collection = "Athlete")
public class AthleteDocument {

    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String firstname;
    @Field
    private String country;
}
