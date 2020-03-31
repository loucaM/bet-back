package com.bet.app.entity;

import java.util.List;

public interface AthleteRepository {
    void create(Athlete athlete);
    List<Athlete> getAll();
    List<Athlete> getByStartList();
}
