package com.concepts.java.eventmanagement.managers;


import com.concepts.java.eventmanagement.entities.Event;

public class EventManagerImpl implements EventManager {

	@Override
	public Event create(Long id) {
		return new Event(id, null, null);
	}

}
