package com.canerbeyza.hrms.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employers")
public class Employer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "web_site")
    private String webSite;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "phone_number")
    private String phoneNumber;

    @OneToOne
    private User user;
}
