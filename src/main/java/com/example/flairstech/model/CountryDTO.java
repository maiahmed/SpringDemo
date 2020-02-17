package com.example.flairstech.model;

public class CountryDTO {
    private String name;
    private String continent;
    private int population;
    private Float life_expectancy;
    private String country_language;

    public CountryDTO(String name, String continent, int population, Float life_expectancy, String country_language) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.life_expectancy = life_expectancy;
        this.country_language = country_language;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Float getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(Float life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    public String getCountry_language() {
        return country_language;
    }

    public void setCountry_language(String country_language) {
        this.country_language = country_language;
    }
}
