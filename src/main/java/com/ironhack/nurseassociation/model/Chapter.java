package com.ironhack.nurseassociation.model;

import jakarta.persistence.*;
import jdk.jfr.Name;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chapter_id;
    private String name;
    private String district;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member president;
    @ManyToMany
    @JoinTable(
            name = "chapter_nurses",
            joinColumns = @JoinColumn(name = "chapter_id"),
            inverseJoinColumns = @JoinColumn(name = "nurse_id")

    )
    private List<Member> memberList;
}
