package com.bet.app.document;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@Accessors(chain = true )
@Entity
@Table(schema = "json", name = "athlete")
public class AthleteDocument {

    @Id
    @GeneratedValue
    private String id;
    private String name;
    private String firstname;
    private String country;
    private String reactionTime;
}
