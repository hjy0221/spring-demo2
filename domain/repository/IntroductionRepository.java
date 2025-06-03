package com.jaeyoon.blog.domain.repository;

import com.jaeyoon.blog.domain.entity.Introduction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IntroductionRepository extends JpaRepository<Introduction, Long> {
    List<Introduction> findAllByIsActive(boolean isActive);
}
