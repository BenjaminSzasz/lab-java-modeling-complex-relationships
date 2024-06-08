package com.ironhack.nurseassociation.Event;

import com.ironhack.nurseassociation.model.Speaker;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Conferences extends Event {
    @OneToMany
    @JoinColumn(name = "event_id")
    private List<Speaker> speakers;

}
