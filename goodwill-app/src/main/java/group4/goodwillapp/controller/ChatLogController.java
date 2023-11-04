package group4.goodwillapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import group4.goodwillapp.model.Chat;
import group4.goodwillapp.service.ChatLogService;


@RestController
@RequestMapping("/chatlog")
public class ChatLogController {
    
    @Autowired
    private ChatLogService chatLogService;

    @PostMapping("/addChat")
    public void addChatToChatLog(@RequestBody long chatLogId,@RequestBody Chat chat){
        chatLogService.updateChatLog(null);
    }

}
