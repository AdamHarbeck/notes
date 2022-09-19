package com.revature.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.revature.events.UserChangeEvent;

@Service
public class MessageService {

	private KafkaTemplate<String, UserChangeEvent> kt;

	@Autowired
	public MessageService(KafkaTemplate<String, UserChangeEvent> kt) {
		super();
		this.kt = kt;
	}
	
	public void triggerEvent(UserChangeEvent event) {
		kt.send("users", event); // here the key of the record is null
//		kt.send("users", Integer.toString(event.getUserId()), event); -- in this case, the key would be the id of the user to make sure that all of the record for the same user end up in the same partition
	}
}
