package com.example.demo.controller.rest;

import com.example.demo.model.Moves;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jankenpon")
public class JuegoRestController{

    private List<Moves> results = new ArrayList<>();

    @PostMapping("/play")
    public ResponseEntity<Moves> playRound(@RequestParam String jugador1, @RequestParam String jugador2) {

        String winner = determineWinner(jugador1, jugador2);
        Moves roundResult = new Moves(jugador1, jugador2, winner);
        results.add(roundResult);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(roundResult);
    }

    private String determineWinner(String player1, String player2) {
        if (player1.equals(player2)) {
            return "empate";
        } else if ((player1.equals("piedra") && player2.equals("tijeras")) ||
        (player1.equals("papel") && player2.equals("piedra")) ||
        (player1.equals("tijeras") && player2.equals("papel"))) {
            return "jugador1";
        } else {
            return "jugador2";
        }
    }
}
