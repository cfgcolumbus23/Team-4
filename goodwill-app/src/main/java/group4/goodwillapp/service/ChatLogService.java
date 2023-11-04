package group4.goodwillapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import group4.goodwillapp.model.ChatLog;
import group4.goodwillapp.repository.ChatLogRepository;
import group4.goodwillapp.repository.ChatRepository;

public class ChatLogService {

    @Autowired
    private ChatLogRepository chatLogRepository;


    //Find ChatLog
    public Optional<ChatLog> findByChatLogId(Long chatLogId){
        return chatLogRepository.findByChatLogId(chatLogId);
    }

    Optional<ChatLog> findByChatId(long chatId){
        return chatLogRepository.findAll().stream().filter(chatLog -> {for()})
    }

    Optional<ChatLog> findByApplicantId(long applicantId);

    Optional<ChatLog> findByCoachId(long coachId);
    
}
