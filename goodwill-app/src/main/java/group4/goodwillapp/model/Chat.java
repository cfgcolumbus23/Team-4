package group4.goodwillapp.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "chats")
public class Chat {
    @Id
    private long chatId;

    @JsonProperty("timeSent")
    private LocalDateTime timeSent;

    @JsonProperty("message")
    private String message;

    @JsonProperty("senderName")
    private String senderName;

    public Chat(){}

    public Chat(long chatId,LocalDateTime timeSent,String message,String senderName){
        this.chatId = chatId;
        this.timeSent = timeSent;
        this.message = message;
        this.senderName = senderName;
    }
    
}
