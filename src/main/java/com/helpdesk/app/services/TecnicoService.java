package com.helpdesk.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helpdesk.app.domain.Tecnico;
import com.helpdesk.app.exception.ObjectNotFoundException;
import com.helpdesk.app.repositories.TecnicoRepository;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Técnico não encontado!"));
	}
	
	public List<Tecnico> findAll() {
		return repository.findAll();
	}
}
