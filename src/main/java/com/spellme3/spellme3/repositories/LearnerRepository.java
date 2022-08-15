package com.spellme3.spellme3.repositories;

import com.spellme3.spellme3.model.Learner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LearnerRepository  extends JpaRepository<Learner, Long> {
//    List<Learner> findAllWordsAttempted(Long id);
//    List<Learner> findAllLearner(List Learner);
    Learner deleteByName(String name);
  Learner findByName(String name);

}
