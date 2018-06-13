package com.bkpw.projektkoncowy.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "positions")
public class Position extends BaseEntity{

    @NotNull
    @Column(name = "position", nullable = false)
    private String name;


}
