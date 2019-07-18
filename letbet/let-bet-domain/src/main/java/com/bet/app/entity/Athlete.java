package com.bet.app.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@NoArgsConstructor
public class Athlete {
    private String name;
    private String firstname;
    private String country;
}
