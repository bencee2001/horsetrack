package com.example.horsetrack.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Race {

    @Id
    @GeneratedValue
     private int id;

    @NonNull
    private String place;

    @OneToMany
    private List<Horse> horseList = new ArrayList<Horse>();

    @OneToMany(mappedBy = "race")
    private List<Bet> bets = new ArrayList<Bet>();

}
