package com.example.flairstech.model;


import javax.persistence.*;

@Entity
@Table(name = "country_language")
public class CountryLanguage {

    private String country_code;
    private String language;
    private boolean is_official;
    private float percentage;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    @Column(name = "language", nullable = false)
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Column(name = "is_official", nullable = false)
    public boolean isIs_official() {
        return is_official;
    }

    public void setIs_official(boolean is_official) {
        this.is_official = is_official;
    }

    @Column(name = "percentage", nullable = false)
    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }


}
