package com.spellme3.spellme3.repositories;

import com.spellme3.spellme3.model.SpellMe;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellMeRepository extends JpaRepository<SpellMe, Long> {
}
