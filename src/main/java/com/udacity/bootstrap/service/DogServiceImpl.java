package com.udacity.bootstrap.service;

import com.udacity.bootstrap.entity.Dog;
import com.udacity.bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    DogRepository dogRepository;

    @Override
    public List<String> retrieveDogBreeds() {
        return (List<String>) dogRepository.findAllBreed();
    }

    @Override
    public List<Dog> retrieveDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public String retrieveDogById(Long id) {
        return dogRepository.findBreedById(id);
    }

    @Override
    public List<String> retrieveDogNames() {
        return (List<String>) dogRepository.findAllName();
    }
}
