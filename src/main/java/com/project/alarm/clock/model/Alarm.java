package com.project.alarm.clock.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "alarms")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Alarm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer hour;

    @Column(nullable = false)
    private Integer minute;

    @Column(nullable = false)
    private String amPm;

    @Column(nullable = false)
    private Boolean enabled;
}