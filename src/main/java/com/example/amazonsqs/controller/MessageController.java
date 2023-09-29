package com.example.amazonsqs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.amazonsqs.service.MessageSender;

@RestController
@RequestMapping("/api/sqs")
public class MessageController {

	@Autowired
	private MessageSender messageSender;

	@PostMapping("/{message}")
	public void getProduct(@PathVariable String message) {
		messageSender.sendMessage(message);
	}

}
