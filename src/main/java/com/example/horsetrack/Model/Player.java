package com.example.horsetrack.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue
    private int id;

    @NonNull
    private String name;

    @NonNull
    private int balance;

    @OneToMany(mappedBy = "player")
    private List<Bet> betList=new ArrayList<>();



}
