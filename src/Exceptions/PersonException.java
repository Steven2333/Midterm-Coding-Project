package Exceptions;

import core.Person;

public class PersonException extends Exception {
	
	private Person person;
	
	public PersonException(Person person) {
		this.person = person;
	}
	
}
