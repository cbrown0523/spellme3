package com.spellme3.spellme3.repositories;

import com.spellme3.spellme3.model.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountHolderRepository extends JpaRepository< AccountHolder, Long> {
}
