package com.spellme3.spellme3.repositories;

import com.spellme3.spellme3.model.ERole;
import com.spellme3.spellme3.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}