package com.example.horsetrack.Model;

import com.example.horsetrack.Modifiers.Modifier;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Horse {

    @Id
    String name;
    @NonNull Integer age;
    @NonNull Double speed;

    @ElementCollection
    List<Modifier> modifierList = new ArrayList<Modifier>();

}
