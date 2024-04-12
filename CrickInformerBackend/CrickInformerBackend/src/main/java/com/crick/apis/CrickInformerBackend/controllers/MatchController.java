package com.crick.apis.CrickInformerBackend.controllers;

import com.crick.apis.CrickInformerBackend.entities.Match;
import com.crick.apis.CrickInformerBackend.entities.MatchStatus;
import com.crick.apis.CrickInformerBackend.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    @Autowired
    private MatchService matchSerivce;

    public MatchController(MatchService matchSerivce) {
        this.matchSerivce = matchSerivce;
    }

    //      get live matches

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches() {
        return new ResponseEntity<>(this.matchSerivce.getLiveMatches(), HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchSerivce.getAllMatches(), HttpStatus.OK);
    }

//      get points table

    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable() {
        return new ResponseEntity<>(this.matchSerivce.getPointTable(), HttpStatus.OK);
    }
}

