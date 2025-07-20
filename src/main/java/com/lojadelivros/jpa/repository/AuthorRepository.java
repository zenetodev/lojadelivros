package com.lojadelivros.jpa.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadelivros.jpa.model.AuthorModel;

public interface AuthorRepository extends JpaRepository<AuthorModel, UUID> {
}
