package com.example.flairstech.controller;


import com.example.flairstech.model.CountryDTO;
import com.example.flairstech.service.CountryService;
import com.example.flairstech.utils.Constants;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.event.annotation.BeforeTestClass;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


@ExtendWith(MockitoExtension.class)
@SpringBootTest
class CountryControllerTest {

    private static CountryDTO countryDTO;

    @Mock
    private CountryService countryService;

    @InjectMocks
    private CountryController countryController;

    @BeforeTestClass
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @BeforeAll
    public static void init() {
        countryDTO = new CountryDTO("Bahrain","Asia",617000, (float) 73.0,"Arabic");
    }

    @Test
    void findById_WhenMatch() {

        Mockito.when(countryService.getCountryByCode(Constants.CORRECT_COUNTRY_CODE)).thenReturn(countryDTO);
        ResponseEntity<CountryDTO> countryDTOResponseEntity = countryController.getCountryByCode(Constants.CORRECT_COUNTRY_CODE);
        assertThat(countryDTOResponseEntity.getBody(), is(countryDTO) );
    }

    @Test
    void findById_WhenNoMatch() {

        Mockito.when(countryService.getCountryByCode(Constants.WRONG_COUNTRY_CODE)).thenReturn(null);
        ResponseEntity<CountryDTO> countryDTOResponseEntity = countryController.getCountryByCode(Constants.WRONG_COUNTRY_CODE);
        assertThat(countryDTOResponseEntity.getStatusCode(), is(HttpStatus.INTERNAL_SERVER_ERROR));
        assertThat(String.valueOf(countryDTOResponseEntity.getBody()), equalTo(Constants.INVALID_COUNTRY_CODE));
    }

}
