package com.example.flairstech.controller;

import com.example.flairstech.model.CountryDTO;
import com.example.flairstech.service.CountryService;
import com.example.flairstech.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CountryController {
    @Autowired
    private CountryService countryService;


    @GetMapping("/{code}")
    public ResponseEntity<CountryDTO> getCountryByCode(@PathVariable("code") String code) {
        CountryDTO countryDTO = countryService.getCountryByCode(code);
        if(countryDTO == null){
            return new ResponseEntity(Constants.INVALID_COUNTRY_CODE, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>(countryDTO, new HttpHeaders(), HttpStatus.OK);
    }
}
