package com.lojadelivros.jpa.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lojadelivros.jpa.model.BookModel;

public interface BookRepository extends JpaRepository<BookModel, UUID> {
}
