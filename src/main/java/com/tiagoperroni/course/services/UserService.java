package com.tiagoperroni.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.tiagoperroni.course.entities.User;
import com.tiagoperroni.course.repositories.UserRepository;
import com.tiagoperroni.course.services.exceptions.DatabaseException;
import com.tiagoperroni.course.services.exceptions.ResourceNotFoundExcetption;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundExcetption(id));

	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		try {
		repository.deleteById(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundExcetption(id);
		}catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
 		}
	}
	
	public User update(Long id, User obj) {
		
		User newUser = findById(id);
		newUser.setName(obj.getName());
		newUser.setEmail(obj.getEmail());
		newUser.setPhone(obj.getPhone());
		return repository.save(newUser);
	}

}
