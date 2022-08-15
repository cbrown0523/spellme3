package com.spellme3.spellme3.repositories;

import com.spellme3.spellme3.model.Term;
import com.spellme3.spellme3.model.Word;
import com.spellme3.spellme3.model.WordList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WordListRepository extends JpaRepository<WordList,Long> {
    List<WordList> findAllByLearner_Id(Long id);
//    List<WordList> createWordListByLearner_Id(Long id);


}