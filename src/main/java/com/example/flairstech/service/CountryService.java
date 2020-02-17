package com.example.flairstech.service;

import com.example.flairstech.model.CountryDTO;
import com.example.flairstech.repository.CountryRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    CountryRepository repository;

    @Autowired
    EntityManagerFactory emf;

    public CountryDTO getCountryByCode(String code) {
        List<CountryDTO> list = repository.getCountryByCode(code);
            if(list.isEmpty()){
                return null;
            }
            return list.get(0);



    }
}
