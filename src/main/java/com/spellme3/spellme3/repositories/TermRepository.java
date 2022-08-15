package com.spellme3.spellme3.repositories;

import com.spellme3.spellme3.model.Term;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.function.Supplier;

public interface TermRepository extends JpaRepository<Term, Long> {
List<Term> findAllByGrade(String grade);
Term findByTerm(String term);
List<Term> deleteAllByGrade(String grade);
List<Term> deleteByTerm(String term);
List<Term> deleteAllByTerm(String[] term);
}