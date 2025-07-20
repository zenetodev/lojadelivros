package com.lojadelivros.jpa.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojadelivros.jpa.model.PublisherModel;

public interface PublisherRepository extends JpaRepository<PublisherModel, UUID> {
}
