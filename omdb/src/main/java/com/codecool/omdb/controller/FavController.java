package com.codecool.omdb.controller;

import com.codecool.omdb.model.Favourites;
import com.codecool.omdb.service.FavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/favourites")
public class FavController {
    private final FavService favService;
    @Autowired
    public FavController(FavService favService) {
        this.favService = favService;
    }

    @GetMapping
    public List<Favourites> getAllFavs() {
        return favService.getAllFavs();
    }

    @PostMapping
    public void addFav(@RequestBody Favourites favourite) {
        favService.addFav(favourite);
    }
    @DeleteMapping
    public void deleteFav(@RequestBody Favourites favourite) {
        favService.deleteFav(favourite);
    }
}

