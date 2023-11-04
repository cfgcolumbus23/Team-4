package group4.goodwillapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Document(collection = "feedback")
public class Feedback {
    @Id
    private long feedbackId;
    private String message;
    private boolean isSingleParent;
    private boolean isVeteran;
    private boolean wasIncarcerated;
    private boolean hasIDD;
    
    public Feedback(long feedbackId, String message, boolean isSingleParent, boolean isVeteran, boolean wasIncarcerated,
            boolean hasIDD) {
        this.feedbackId = feedbackId;
        this.message = message;
        this.isSingleParent = isSingleParent;
        this.isVeteran = isVeteran;
        this.wasIncarcerated = wasIncarcerated;
        this.hasIDD = hasIDD;
    }
    
}
