package com.spellme3.spellme3.repositories;

import com.spellme3.spellme3.model.AccountHolder;
import com.spellme3.spellme3.model.Learner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountHolderRepository extends JpaRepository< AccountHolder, Long> {
    List<AccountHolder> findAllByLearner_id(Long id);
}
