package group4.goodwillapp.model;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Document(collection = "courses")
public class Course{
    @Id
    private long courseId;

    @JsonProperty("title")
    private String title; 

    @JsonProperty("description")
    private String description; 

    @JsonProperty("dateAdded")
    private LocalDateTime dateAdded;

    @JsonProperty("courseLength")
    private String courseLength;
    
    @JsonProperty("availability")
    private boolean availabilty; //is the course available to take
    
    @JsonProperty("courseProvider")
    private String courseProvider;
}