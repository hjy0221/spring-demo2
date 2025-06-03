package com.jaeyoon.blog.domain.repository;

import com.jaeyoon.blog.domain.entity.Achievement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AchievementRepository extends JpaRepository<Achievement, Long> {
    List<Achievement> findAllByIsActive(boolean isActive);
}
