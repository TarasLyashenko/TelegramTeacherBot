package entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Lesson
{
    private String title;
    private int number;

    public String getTitle()
    {
        return title;
    }
}
