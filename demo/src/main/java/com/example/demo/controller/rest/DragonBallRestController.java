package com.example.demo.controller.rest;

import com.example.demo.model.BolasDeDragon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/dragonball")
public class DragonBallRestController {
    private List<BolasDeDragon> dragonBallsList = new ArrayList<>();

    private List<BolasDeDragon> dragonBallsOwned = new ArrayList<>();

    @GetMapping("/radar")
    public ResponseEntity<List<BolasDeDragon>> listDragonBallsSpread() {
        return ResponseEntity.ok(dragonBallsList);
    }






}
