package group4.goodwillapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.Chat;
import group4.goodwillapp.model.ChatLog;
import group4.goodwillapp.repository.ChatLogRepository;

@Service
public class ChatLogService {

    @Autowired
    private ChatLogRepository chatLogRepository;

    @Autowired
    private IdCounterService idCounterService;


    //Find ChatLog
    public Optional<ChatLog> findByChatLogId(Long chatLogId){
        return chatLogRepository.findByChatLogId(chatLogId);
    }

    public Optional<ChatLog> findByChatId(long chatId){
        return chatLogRepository.findAll().stream().filter((chatLog) -> {
            for(Chat chat: chatLog.getChats()){
                return chat.getChatId() == chatId;
            }
            return false;
        }).findAny();
    }

    public Optional<ChatLog> findByApplicantId(long applicantId){
       return chatLogRepository.findByApplicantId(applicantId);
    }

    public Optional<ChatLog> findByCoachId(long coachId){
        return chatLogRepository.findByCoachId(coachId);
    }

    public void saveChatLog(ChatLog chatLog){
        chatLog.setChatLogId(idCounterService.getIdCounterNumByCollection("courses"));
        chatLogRepository.save(chatLog);
    }
    
}
