package group4.goodwillapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Document(collection = "feedback")
public class Feedback {
    @Id

    @JsonProperty("feedbackId")
    private long feedbackId;

    @JsonProperty("message")
    private String message;

    @JsonProperty("isSingleParent")
    private boolean isSingleParent;

    @JsonProperty("isVeteran")
    private boolean isVeteran;

    @JsonProperty("wasIncarcerated")
    private boolean wasIncarcerated;

    @JsonProperty("hasIDD")
    private boolean hasIDD;
    
    public Feedback(long feedbackId, String message, boolean isSingleParent, boolean isVeteran, boolean wasIncarcerated,
            boolean hasIDD) {
        this.message = message;
        this.isSingleParent = isSingleParent;
        this.isVeteran = isVeteran;
        this.wasIncarcerated = wasIncarcerated;
        this.hasIDD = hasIDD;
    }
    
}
