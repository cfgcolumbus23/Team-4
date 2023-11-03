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
    private long feedBackId;
    private String message;
    private boolean isSingleParent;
    private boolean isVeretran;
    private boolean wasIncareated;
    private boolean hasIDD;
    
    public Feedback(long feedBackId, String message, boolean isSingleParent, boolean isVeretran, boolean wasIncareated,
            boolean hasIDD) {
        this.feedBackId = feedBackId;
        this.message = message;
        this.isSingleParent = isSingleParent;
        this.isVeretran = isVeretran;
        this.wasIncareated = wasIncareated;
        this.hasIDD = hasIDD;
    }


    
}
