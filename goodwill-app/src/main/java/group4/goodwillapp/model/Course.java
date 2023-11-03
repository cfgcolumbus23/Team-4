package group4.goodwillapp.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

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

}