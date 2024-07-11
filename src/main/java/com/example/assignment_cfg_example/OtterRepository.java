package com.example.assignment_cfg_example;

import com.example.assignment_cfg_example.model.Otter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtterRepository extends JpaRepository<Otter, Long> {
// needs to have Entity, EntityIdType
    // entity id type cannot be primitive
}
