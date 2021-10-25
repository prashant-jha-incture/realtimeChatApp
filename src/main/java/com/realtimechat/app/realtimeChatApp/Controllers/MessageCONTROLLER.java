package com.realtimechat.app.realtimeChatApp.Controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.realtimechat.app.realtimeChatApp.DTO.MessageDTO;

@RestController
public class MessageCONTROLLER {
	//controller for new messages
	
	@MessageMapping("/message")
	@SendTo("/topic/return-to")
	public MessageDTO getContent(@RequestBody MessageDTO message){
		
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		
		return message;
	}
}
