package com.springboot.SpringEmaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {

	@Autowired
	private EmailSenderService senderService;

	@GetMapping("/emailSend")
	//@EventListener(ApplicationReadyEvent.class)
	public String sendMail() {
		senderService.sendEmail("This is subject", "This is body");
		return "Mail Sent successfully...";

	}

}
