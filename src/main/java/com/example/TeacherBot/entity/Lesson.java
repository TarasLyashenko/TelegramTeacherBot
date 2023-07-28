package com.example.TeacherBot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Lesson
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private String title;
    private int number;

}
