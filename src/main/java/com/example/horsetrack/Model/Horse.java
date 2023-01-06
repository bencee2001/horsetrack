package com.example.horsetrack.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Horse {

    @Id
    private String name;
    @NonNull
    private int age;
    @NonNull
    private double speed;

}
