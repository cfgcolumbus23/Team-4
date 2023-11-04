package group4.goodwillapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import group4.goodwillapp.model.Chat;
import group4.goodwillapp.repository.ChatRepository;

@Service
public class ChatService {

    @Autowired
    private ChatRepository chatRepository;

    @Autowired
    private IdCounterService idCounterService;

    
    public Optional<Chat> findByChatId(Long chatId){
        return chatRepository.findByChatId(chatId);
    }

    public List<Chat> findByMessageContent(String message){
        return chatRepository.findAll().stream().filter(chat -> chat.getMessage().contains(message)).toList();
    }

    public void saveChat(Chat chat){
        chat.setChatId(idCounterService.getIdCounterNumByCollection("chats"));
        chatRepository.save(chat);
    }
}
