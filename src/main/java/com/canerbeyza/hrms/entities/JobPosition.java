package com.canerbeyza.hrms.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "job_positions")
public class JobPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "position_name")
    private String positionName;

}
