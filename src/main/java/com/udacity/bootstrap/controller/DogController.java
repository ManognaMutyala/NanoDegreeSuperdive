package com.udacity.bootstrap.controller;

import com.udacity.bootstrap.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class DogController {

    @Autowired
    DogService dogService;

    @GetMapping("/getBreeds")
    public ResponseEntity <List<String> >getDogBreeds(){
        return new ResponseEntity<List<String>>(dogService.retrieveDogBreeds(), HttpStatus.OK) ;
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<String> getDogById(@PathVariable("id") Long id){
        ResponseEntity<String> dogResponseEntity = new ResponseEntity<String>(dogService.retrieveDogById(id),HttpStatus.OK);
        return dogResponseEntity;
    }
    @GetMapping("/getNames")
    public ResponseEntity<List<String>> getDogNames(){
        return new ResponseEntity<List<String>>(dogService.retrieveDogNames(), HttpStatus.OK) ;

    }
}
