package com.spellme3.spellme3.repositories;

import com.spellme3.spellme3.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WordRepository extends JpaRepository<Word, Long>{
    void delete(String word);
}
