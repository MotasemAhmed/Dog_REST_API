package com.udacity.DogRestApi.controller;

import com.udacity.DogRestApi.entity.Dog;
import com.udacity.DogRestApi.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private DogService dogService;

    @Autowired
    public DogController(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getDogs() {
        List<Dog> dogList = dogService.retrieveDogs();
        return new ResponseEntity<List<Dog>>(dogList, HttpStatus.OK);
    }

    @GetMapping("/dogs/breed")
    public ResponseEntity<List<String>> getDogBreeds() {
        List<String> dogBreedsList = dogService.retrieveDogBreeds();
        return new ResponseEntity<List<String>>(dogBreedsList, HttpStatus.OK);
    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getDogBreedById(@PathVariable Long id) {
        String dogBreed = dogService.retrieveDogBreedById(id);
        return new ResponseEntity<String>(dogBreed, HttpStatus.OK);
    }

    @GetMapping("/dogs/names")
    public ResponseEntity<List<String>> getDogNames() {
        List<String> dogNames = dogService.retrieveDogNames();
        return new ResponseEntity<List<String>>(dogNames, HttpStatus.OK);
    }
}
