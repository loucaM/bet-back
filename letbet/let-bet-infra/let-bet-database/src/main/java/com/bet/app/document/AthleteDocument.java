package com.bet.app.document;

import com.mongodb.lang.Nullable;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@Accessors(chain = true )
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
