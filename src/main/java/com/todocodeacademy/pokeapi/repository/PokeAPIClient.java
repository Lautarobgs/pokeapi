package com.todocodeacademy.pokeapi.repository;

import com.todocodeacademy.pokeapi.dto.PokeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "pokeapi", url = "https://pokeapi.co/api/v2")
public interface PokeAPIClient {
    @GetMapping("/pokemon/{pokemonid}")
    PokeDTO getPokemonInfo(@PathVariable ("pokemonid") int pokemonid);
}
