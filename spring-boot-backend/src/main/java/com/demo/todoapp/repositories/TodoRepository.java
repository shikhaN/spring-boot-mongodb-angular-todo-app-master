package com.demo.todoapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.demo.todoapp.models.Todo;

/**
 * @author Shikha
 *
 */
@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}