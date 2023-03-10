package com.concepts.java.eventmanagement.test;

import com.concepts.java.eventmanagement.entities.Event;
import com.concepts.java.eventmanagement.entities.Organizer;
import com.concepts.java.eventmanagement.managers.EventManager;
import com.concepts.java.eventmanagement.managers.EventManagerImpl2;

public class Test {

	public static void main(String[] args) {

		Organizer organizer = new Organizer();
		organizer.setId(123l);
		organizer.setName("Apple Inc");
		System.out.println(organizer);
		System.out.println(organizer.getName());

		Event event = new Event(456l, "Ihpone 100 Launch", "Grand Launch");
		System.out.println(event.getDescription());

		EventManager em = new EventManagerImpl2();
		System.out.println(em.create(456l).getName());

	}

}
