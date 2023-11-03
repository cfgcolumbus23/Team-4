package group4.goodwillapp.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "courses")
public class Course{
    @Id
    private long courseId;

    private String title; 
    private String description; 
    private LocalDateTime timeApplied;
    private String courseLength;
    private boolean availabilty; //is the course available to take
    private String courseProvider;
    //for if goodwill over courses provided by other entities
    
    public Course(){}

    public Course(long courseId, String title, String description, LocalDateTime timeApplied, String courseLength,
            boolean availabilty, String courseProvider) {
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.timeApplied = timeApplied;
        this.courseLength = courseLength;
        this.availabilty = availabilty;
        this.courseProvider = courseProvider;
    }

    

}