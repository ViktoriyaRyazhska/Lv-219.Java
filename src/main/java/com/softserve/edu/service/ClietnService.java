package com.softserve.edu.service;

import java.util.List;

import com.mysql.fabric.xmlrpc.Client;

public interface ClietnService {

	public void add(Client client);

	public void update(Client client);

	public Client getById(Client client);

	public List<Client> getAllElements();

	public void delete(Client client);

	public Client find(String firstName, String lastName);

}
