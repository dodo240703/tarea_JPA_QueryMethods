package com.example.tareagtics.Models.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name = "departments")
public class Department {

    @Id
    @Column (name = "department_id", nullable = false, length = 4)
    private Integer idDepartment;

    @Column (name = "department_name", nullable = false, length = 30)
    private String nameDepartment;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
}
