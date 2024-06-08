package com.ironhack.nurseassociation.Event;

import com.ironhack.nurseassociation.model.Guest;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
@Data
@Entity
@Table(name = "events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date date;
    private int duration;
    private String location;
    private String title;
    @ManyToMany
    @JoinTable(name = "event guest",
            joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "guest_id")

    )
    private List<Guest> guests;


}
