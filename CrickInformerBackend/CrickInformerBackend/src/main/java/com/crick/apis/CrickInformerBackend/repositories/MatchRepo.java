package com.crick.apis.CrickInformerBackend.repositories;

import com.crick.apis.CrickInformerBackend.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Integer> {
//      match fetch karna chahta hoon -->
//      provide kar de --> teamHeading

    Optional<Match> findByTeamHeading(String teamHeading);
}
