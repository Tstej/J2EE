package com.contactManager.data;

import com.contactManager.entity.Contact;

public interface Data {

	void addContact(Contact contact);

	void deleteContact(int id);
	
	Contact findContactById(int id);

	Contact[] findAllContacts();

}