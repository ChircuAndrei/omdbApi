package com.codecool.omdb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Favourites {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String imdbID;
    private Long your_rating;


    @Override
    public String toString() {
        return "Favourites{" +
                "id=" + id +
                ", imdbID='" + imdbID + '\'' +
                ", your_rating=" + your_rating +
                '}';
    }
}
