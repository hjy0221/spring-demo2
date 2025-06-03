package com.jaeyoon.blog.domain.repository;

import com.jaeyoon.blog.domain.entity.HttpInterface;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface HttpInterfaceRepository extends JpaRepository<HttpInterface, Long> {
    long countAllByCreatedDateTimeBetween(LocalDateTime start, LocalDateTime end);
}
