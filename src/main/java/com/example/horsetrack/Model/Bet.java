package com.example.horsetrack.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Bet {

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    @NonNull
    private Player player;

    @ManyToOne
    @NonNull
    private Horse horse;

    @ManyToOne
    @NonNull
    private Race race;

    @NonNull
    private int value;

}
