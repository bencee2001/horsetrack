package com.example.horsetrack.Repository;

import com.example.horsetrack.Model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepo extends JpaRepository< Race , Integer> {

    Race findByPlace(String Place);

}
