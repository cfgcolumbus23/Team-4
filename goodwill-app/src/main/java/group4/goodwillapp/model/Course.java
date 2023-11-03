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
    public long getCourseId() {
        return courseId;
    }
    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public LocalDateTime getTimeApplied() {
        return timeApplied;
    }
    public void setTimeApplied(LocalDateTime timeApplied) {
        this.timeApplied = timeApplied;
    }
    public String getCourseLength() {
        return courseLength;
    }
    public void setCourseLength(String courseLength) {
        this.courseLength = courseLength;
    }
    public boolean isAvailabilty() {
        return availabilty;
    }
    public void setAvailabilty(boolean availabilty) {
        this.availabilty = availabilty;
    }
    public String getCourseProvider() {
        return courseProvider;
    }
    public void setCourseProvider(String courseProvider) {
        this.courseProvider = courseProvider;
    }

}