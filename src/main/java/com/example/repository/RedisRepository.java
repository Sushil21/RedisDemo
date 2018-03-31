package com.example.repository;

import java.util.Map;
import java.util.Set;

import com.example.model.User;

public interface RedisRepository {

    /**
     * Return all movies
     */
    Map<Object, Object> findAllUsers();

    /**
     * Add key-value pair to Redis.
     */
    void add(User movie);

    /**
     * Delete a key-value pair in Redis.
     */
    void delete(String id);
    
    /**
     * find a movie
     */
    User findUser(String id);
    
}
