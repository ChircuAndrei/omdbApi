package com.codecool.omdb.controller;

import com.codecool.omdb.model.Favourites;
import com.codecool.omdb.service.FavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/{id}")
    public Optional<Favourites> getByid(PathVariable id) {
        return favService.findById(id);
    }

    @PostMapping
    public void addFav(@RequestBody Favourites favourite) {
        favService.addFav(favourite);
    }

    @DeleteMapping()
    public void deleteItem(@RequestBody Favourites favourite) {
        favService.deleteByID(favourite);
    }
}

