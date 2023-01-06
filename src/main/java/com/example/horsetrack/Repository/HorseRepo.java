package com.example.horsetrack.Repository;

import com.example.horsetrack.Model.Horse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorseRepo extends JpaRepository<Horse, String > {

    Horse findByName(String name);

}
