package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;

import java.util.List;

public interface DogService {

public List<String> retrieveDogBreeds();
    List<Dog> retrieveDogs();

public String retrieveDogById(Long id);
public List<String> retrieveDogNames();
}

