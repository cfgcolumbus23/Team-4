package group4.goodwillapp.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "applicants")
public class Applicant extends Person {
    @Id
    private long applicantId;

    @JsonProperty("timeApplied")
    private LocalDateTime timeApplied;

    @JsonProperty("coursesTaken")
    private ArrayList<Course> coursesTaken;

    @JsonProperty("coachId")
    private long coachId;//id of the current acting coach

    public Applicant(){}

    public Applicant(String name, String email, String phoneNum, int age, String password,
    long applicantId,LocalDateTime timeApplied, ArrayList<Course> coursesTaken, long coachId){
        super(name,email,phoneNum,age,password);
        this.applicantId = applicantId;
        this.timeApplied = timeApplied;
        this.coursesTaken = coursesTaken;
        this.coachId = coachId;
    }
}
