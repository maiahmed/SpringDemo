package com.example.flairstech.model;


import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "country")
public class Country {
    private String code;
    private String name;
    private String continent;
    private String region;
    private float surface_area;
    private Integer indep_year;
    private int population;
    private Float life_expectancy;
    private BigDecimal gnp;
    private BigDecimal gnp_old;
    private String local_name;
    private String government_form;
    private String head_of_state;
    private Integer capital;
    private String code2;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "continent", nullable = false)
    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    @Column(name = "region", nullable = false)
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Column(name = "surface_area", nullable = false)
    public float getSurface_area() {
        return surface_area;
    }

    public void setSurface_area(float surface_area) {
        this.surface_area = surface_area;
    }

    @Column(name = "indep_year")
    public Integer getIndep_year() {
        return indep_year;
    }

    public void setIndep_year(Integer indep_year) {
        this.indep_year = indep_year;
    }

    @Column(name = "population", nullable = false)
    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Column(name = "life_expectancy")
    public Float getLife_expectancy() {
        return life_expectancy;
    }

    public void setLife_expectancy(Float life_expectancy) {
        this.life_expectancy = life_expectancy;
    }

    @Column(name = "gnp")
    public BigDecimal getGnp() {
        return gnp;
    }

    public void setGnp(BigDecimal gnp) {
        this.gnp = gnp;
    }

    @Column(name = "gnp_old")
    public BigDecimal getGnp_old() {
        return gnp_old;
    }

    public void setGnp_old(BigDecimal gnp_old) {
        this.gnp_old = gnp_old;
    }

    @Column(name = "local_name", nullable = false)
    public String getLocal_name() {
        return local_name;
    }

    public void setLocal_name(String local_name) {
        this.local_name = local_name;
    }

    @Column(name = "government_form", nullable = false)
    public String getGovernment_form() {
        return government_form;
    }

    public void setGovernment_form(String government_form) {
        this.government_form = government_form;
    }

    @Column(name = "head_of_state")
    public String getHead_of_state() {
        return head_of_state;
    }

    public void setHead_of_state(String head_of_state) {
        this.head_of_state = head_of_state;
    }

    @Column(name = "capital")
    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

    @Column(name = "code2", nullable = false)
    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    @Override
    public String toString() {
        return "country{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surface_area=" + surface_area +
                ", indep_year=" + indep_year +
                ", population=" + population +
                ", life_expectancy=" + life_expectancy +
                ", gnp=" + gnp +
                ", gnp_old=" + gnp_old +
                ", local_name='" + local_name + '\'' +
                ", government_form='" + government_form + '\'' +
                ", head_of_state='" + head_of_state + '\'' +
                ", capital=" + capital +
                ", code2='" + code2 + '\'' +
                '}';
    }
}
