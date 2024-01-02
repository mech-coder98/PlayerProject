/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.

package com.example.player;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.player.*;

import java.util.*;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class PlayerController {
    PlayerService playerService = new PlayerService();

    @DeleteMapping("player/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId) {
        playerService.deletePlayer(playerId);
    }

    @PutMapping("players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerService.updatePlayer(playerId, player);
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }

    @GetMapping("/players")
    public ArrayList<Player> getPlayer() {
        return playerService.getPlayer();
    }

    @GetMapping("players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return playerService.getPlayerById(playerId);
    }

}
