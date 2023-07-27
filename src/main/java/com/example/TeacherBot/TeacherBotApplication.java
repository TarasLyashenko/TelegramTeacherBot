package com.example.TeacherBot;

import dao.LessonDao;
import entity.Lesson;
import jakarta.annotation.Resource;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeacherBotApplication implements CommandLineRunner
{
    @Resource
    private LessonDao lessonDao;

    public static void main(String[] args)
    {
        SpringApplication.run(TeacherBotApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception
    {
        Lesson lesson = new Lesson();
        lesson.setTitle("Первое занятие");
        lesson.setNumber(1);

        Lesson lesson1 = new Lesson();
        lesson.setTitle("Второе занятие");
        lesson.setNumber(2);

        lessonDao.save(lesson1);
        lessonDao.save(lesson);
    }
}
