package com.example.tag15tangjingjanorecap;

import org.springframework.data.mongodb.repository.MongoRepository;
@org.springframework.stereotype.Repository

public interface Repository extends MongoRepository<ToDo, String> {
}