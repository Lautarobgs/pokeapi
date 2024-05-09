package com.todocodeacademy.pokeapi.controller;

import com.todocodeacademy.pokeapi.dto.PokeDTO;
import com.todocodeacademy.pokeapi.repository.PokeAPIClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PokeController {
    @Autowired
    private PokeAPIClient pokeClient;

    @GetMapping("/pokemon/{pokemonid}")
    public PokeDTO getPokemonInfo(@PathVariable("pokemonid")int pokemonid){
        return pokeClient.getPokemonInfo(pokemonid);
    }
}
