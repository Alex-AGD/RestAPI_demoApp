package com.testagd.costumerdemo.model;

//Base class with property Id POJO

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

// @MappedSuperclass определяет класс - предок для Entity классов
@MappedSuperclass
@Getter
@Setter
@ToString

public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public BaseEntity() {
    }
}
