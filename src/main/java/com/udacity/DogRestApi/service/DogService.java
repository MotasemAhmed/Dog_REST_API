package com.udacity.DogRestApi.service;

import com.udacity.DogRestApi.entity.Dog;

import java.util.List;

public interface DogService {

    List<Dog> retrieveDogs();
    List<String> retrieveDogBreeds();
    String retrieveDogBreedById(long id);
    List<String> retrieveDogNames();
}
