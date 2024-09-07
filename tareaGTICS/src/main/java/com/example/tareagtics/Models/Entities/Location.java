package com.example.tareagtics.Models.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table (name="locations")
public class Location {

    @Id
    @Column (name = "location_id", nullable = false, length = 4)
    private Integer idLocation;

    @Column (name = "city", nullable = false, length = 30)
    private String cityName;

    @Column (name = "state_province", length = 25)
    private String provinceName;
}
