package com.canerbeyza.hrms.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "job_seekers")
public class JobSeeker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "national_no")
    private String nationalNo;

    @Column(name = "birth_date")
    private String yearOfBirthDate;

    @OneToOne
    private User user;
}
