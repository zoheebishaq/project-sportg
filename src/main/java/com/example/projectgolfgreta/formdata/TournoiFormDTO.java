package com.example.projectgolfgreta.formdata;

import lombok.Getter;
import lombok.Setter;
import org.jsoup.Jsoup;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
@Setter
public class TournoiFormDTO {
    private long id;
    //    Failed to convert from type [java.lang.String] to type [java.util.Date] for value
//    https://stackoverflow.com/questions/23702041/failed-to-convert-property-value-of-type-java-lang-string-to-required-type-java
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateDebut;
    private String nom;
    private int nbTours;
    private String commentaire;
    private long userId;
    private long parcoursId;


}
