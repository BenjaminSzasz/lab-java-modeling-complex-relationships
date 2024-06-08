package com.ironhack.nurseassociation.model;

import com.ironhack.nurseassociation.enums.guestResponse;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "guests")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private guestResponse status;
}
