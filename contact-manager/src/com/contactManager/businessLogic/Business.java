package com.contactManager.businessLogic;

public interface Business {

	void addContact();

	void deleteContact();

	void updateContact();

	void findContactByFirstName();

	void findContactByLastName();

	void findAllContacts();

	void search();

}