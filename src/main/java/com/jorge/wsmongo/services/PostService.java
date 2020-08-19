package com.jorge.wsmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorge.wsmongo.domain.Post;
import com.jorge.wsmongo.domain.User;
import com.jorge.wsmongo.dto.UserDTO;
import com.jorge.wsmongo.repository.PostRepository;
import com.jorge.wsmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	public Post findById(String id) {
		
		Optional<Post> post = repo.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
}

