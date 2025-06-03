package com.jaeyoon.blog.domain.repository;

import com.jaeyoon.blog.domain.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    @Query("select p from Project p left join fetch p.skills s left join fetch s.skill where p.isActive = :isActive")
    List<Project> findAllByIsActive(boolean isActive);

    @Query("select p from Project p left join fetch p.details where p.id = :id")
    Optional<Project> findById(Long id);
}
