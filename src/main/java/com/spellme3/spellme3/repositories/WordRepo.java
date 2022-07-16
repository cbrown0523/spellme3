package com.spellme3.spellme3.repositories;

import com.spellme3.spellme3.model.Term;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepo extends JpaRepository<Term, Long> {
}
