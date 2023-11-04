package group4.goodwillapp.model;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "careerpaths")
public class CareerPath {
    @Id
    private long careerPathId;

    @JsonProperty("courseIds")
    private ArrayList<Long> courseIds;

}
