package com.jaeyoon.blog.domain.repository;

import com.jaeyoon.blog.domain.constant.SkillType;
import com.jaeyoon.blog.domain.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface SkillRepository extends JpaRepository<Skill, Long> {
    List<Skill> findAllByIsActive(boolean isActive);
    Optional<Skill> findByNameIgnoreCaseAndType(String name, SkillType type);
}
