package group4.goodwillapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import group4.goodwillapp.model.Chat;
import group4.goodwillapp.repository.ChatRepository;

public class ChatService {

    @Autowired
    private ChatRepository chatRepository;


    
    public Optional<Chat> findByChatId(Long chatId){
        return chatRepository.findByChatId(chatId);
    }

    public List<Chat> findByMessageContent(String message){
        return chatRepository.findAll().stream().filter(chat -> chat.getMessage().contains(message)).toList();
    }

    public void saveChat(Chat chat){
        chatRepository.save(chat);
    }
}
