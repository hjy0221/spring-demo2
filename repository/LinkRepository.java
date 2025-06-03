package com.jaeyoon.blog.domain.repository;

import com.jaeyoon.blog.domain.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link, Long> {
    List<Link> findAllByIsActive(boolean isActive);
}
