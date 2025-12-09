package com.gabrielnatividade.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielnatividade.workshopmongo.domain.User;
import com.gabrielnatividade.workshopmongo.repository.UserRepository;
import com.gabrielnatividade.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired //ele instancia automaticamente pra vc
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
	    return repo.findById(id)
	            .orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
