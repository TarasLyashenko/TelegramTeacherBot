package com.example.TeacherBot.dao;

import com.example.TeacherBot.entity.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonDao extends CrudRepository<Lesson, Long>
{
    Lesson findByTitle(String title);
}
