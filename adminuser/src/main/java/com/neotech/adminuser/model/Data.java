package com.neotech.adminuser.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@lombok.Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate date;
    private String selection;
    private String username;
    private String fullname;

}
