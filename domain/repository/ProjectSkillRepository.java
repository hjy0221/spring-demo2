package com.jaeyoon.blog.domain.repository;

import com.jaeyoon.blog.domain.entity.ProjectSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProjectSkillRepository extends JpaRepository<ProjectSkill, Long> {
    Optional<ProjectSkill> findByProjectIdAndSkillId(Long projectId, Long skillId);
}
