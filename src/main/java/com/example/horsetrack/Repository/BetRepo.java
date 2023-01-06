package com.example.horsetrack.Repository;

import com.example.horsetrack.Model.Bet;
import com.example.horsetrack.Model.Horse;
import com.example.horsetrack.Model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BetRepo extends JpaRepository<Bet,Integer> {

    List<Bet> findByHorseAndRace(Horse horse, Race race);
}
