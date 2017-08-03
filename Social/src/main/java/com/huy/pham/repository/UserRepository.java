package com.huy.pham.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.huy.pham.entities.User;

@Transactional
@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, String>{
	public User findByEmail(String email);
	public User findByPhone(String phone);
}
