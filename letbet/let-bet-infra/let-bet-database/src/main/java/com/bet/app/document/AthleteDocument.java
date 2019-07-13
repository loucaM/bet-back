package com.bet.app.document;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@Entity
@Table(schema = "json", name = "athlete")
public class AthleteDocument {

    @Id
    @GeneratedValue
    private String id;
}
