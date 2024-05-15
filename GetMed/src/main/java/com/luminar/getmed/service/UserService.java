package com.luminar.getmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luminar.getmed.entity.GetMedUser;
import com.luminar.getmed.repository.GetMedUserRepository;

@Service
public class UserService {

	@Autowired
	private GetMedUserRepository userRepository;

	public GetMedUser createUser(GetMedUser user) {
		return userRepository.save(user);
	}

	public List<GetMedUser> getAllUsers() {
		return userRepository.findAll();
	}

	public GetMedUser getUserById(Long userId) {
		Optional<GetMedUser> userOptional = userRepository.findById(userId);
		return userOptional.orElse(null);
	}

	public GetMedUser updateUser(Long userId, GetMedUser updatedUser) {
		Optional<GetMedUser> userOptional = userRepository.findById(userId);
		if (userOptional.isPresent()) {
			GetMedUser user = userOptional.get();
			user.setUsername(updatedUser.getUsername());
			user.setEmail(updatedUser.getEmail());
			user.setPassword(updatedUser.getPassword());
			return userRepository.save(user);
		}
		return null;
	}

	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

	public static <User> User createUser(User user) {
		return null;
	}

	public <User> User updateUser(Long userId, User user) {
		return null;
	}
}
