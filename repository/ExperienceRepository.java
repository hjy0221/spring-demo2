package com.jaeyoon.blog.domain.repository;

import com.jaeyoon.blog.domain.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ExperienceRepository extends JpaRepository<Experience, Long> {

    @Query("select e from Experience e left join fetch e.details where e.isActive = :isActive")
    List<Experience> findAllByIsActive(boolean isActive);

    @Query("select e from Experience e left join fetch e.details where e.id = :id")
    Optional<Experience> findById(Long id);
}
