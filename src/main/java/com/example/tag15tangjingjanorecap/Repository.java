package com.example.tag15tangjingjanorecap;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<ToDo, String> {
}