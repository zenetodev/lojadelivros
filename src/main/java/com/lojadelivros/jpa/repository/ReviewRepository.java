package com.lojadelivros.jpa.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadelivros.jpa.model.ReviewModel;

public interface ReviewRepository extends JpaRepository<ReviewModel, UUID> {
}
