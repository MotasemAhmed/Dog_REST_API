//package com.udacity.DogRestApi.service;
//
//import com.udacity.DogRestApi.entity.Dog;
//import com.udacity.DogRestApi.repository.DogRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class DogServiceImp implements DogService {
//    @Autowired
//    DogRepository dogRepository;
//
//    @Override
//    public List<String> retrieveDogBreeds() {
//        return (List<String>) dogRepository.findAllBreed();
//    }
//
//    @Override
//    public List<String> retrieveDogNames() {
//        return (List<String>) dogRepository.findAllName();
//    }
//
//    @Override
//    public String retrieveDogBreedById(long id) {
//        Optional<String> optionalBreed = Optional.ofNullable(dogRepository.findBreedById(id));
//        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
//        return breed;
//    }
//
//    @Override
//    public List<Dog> retrieveDogs() {
//        return (List<Dog>) dogRepository.findAll();
//    }
//}
