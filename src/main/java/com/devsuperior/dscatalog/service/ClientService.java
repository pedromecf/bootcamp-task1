package com.devsuperior.dscatalog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.devsuperior.dscatalog.entities.Client;
import com.devsuperior.dscatalog.repositories.ClientRepository;

@Service
public class ClientService {

	private ClientRepository clientRepository;

	@Autowired
	public ClientService(final ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	public Page<Client> findAllPaged(PageRequest page) {
		Page<Client> clients = this.clientRepository.findAll(page);
		return clients;
	}

}
