package com.example.horsetrack.Repository;

import com.example.horsetrack.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepo extends JpaRepository<Player, Integer> {
}
