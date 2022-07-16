package com.spellme3.spellme3.repositories;

import com.spellme3.spellme3.model.Learner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearnerRepository  extends JpaRepository<Learner, Long> {
}
