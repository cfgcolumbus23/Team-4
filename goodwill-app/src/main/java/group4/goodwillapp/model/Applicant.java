package group4.goodwillapp.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "applicants")
public class Applicant extends Person {
    @Id
    private long applicantId;
    private LocalDateTime timeApplied;
    private ArrayList<Course> coursesTaken;
    private long coachId;//id of the current acting coach
}
