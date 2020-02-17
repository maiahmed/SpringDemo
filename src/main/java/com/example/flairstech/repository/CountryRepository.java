package com.example.flairstech.repository;

import com.example.flairstech.model.Country;
import com.example.flairstech.model.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
    @Query("SELECT new com.example.flairstech.model.CountryDTO(c.name, c.continent, c.population, c" +
            ".life_expectancy, cl.language) FROM " +
            "CountryLanguage cl, Country c WHERE cl.country_code = c.code and cl.country_code = ?1 and c.code = ?1")
    List<CountryDTO> getCountryByCode(String code) ;
}

