package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll() {
        List <Game> result = gameRepository.findAll();
        List<GameMinDto> dto = result.stream().map(x-> new GameMinDto(x)).collect(Collectors.toList());
        return dto;
    }
}
