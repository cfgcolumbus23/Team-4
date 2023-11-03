package group4.goodwillapp.model;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Document(collection = "courses")
public class Course{
    @Id
    private long courseId;

    private String title; 
    private String description; 
    private LocalDateTime dateAdded;
    private String courseLength;
    private boolean availabilty; //is the course available to take
    private String courseProvider;

}