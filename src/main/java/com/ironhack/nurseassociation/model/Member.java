package com.ironhack.nurseassociation.model;

import com.ironhack.nurseassociation.enums.memberStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "nurses")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int member_id;
    private String member_name;
    @Enumerated(EnumType.STRING)
    private memberStatus member_status;
    private Date renewal_date;

}
