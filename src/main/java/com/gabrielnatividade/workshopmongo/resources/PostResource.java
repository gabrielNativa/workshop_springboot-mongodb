package com.gabrielnatividade.workshopmongo.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gabrielnatividade.workshopmongo.domain.Post;
import com.gabrielnatividade.workshopmongo.domain.User;
import com.gabrielnatividade.workshopmongo.dto.UserDTO;
import com.gabrielnatividade.workshopmongo.services.PostService;
import com.gabrielnatividade.workshopmongo.services.UserService;

@RestController// para definir se é uma class rest
@RequestMapping(value = "/posts") // para definir o nome do endpoint
public class PostResource {
	
	@Autowired
	private PostService service;
	
	@RequestMapping (value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
