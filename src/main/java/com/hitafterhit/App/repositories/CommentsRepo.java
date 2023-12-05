package com.hitafterhit.App.repositories;

import com.hitafterhit.App.models.Comments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepo extends JpaRepository<Comments, Long> {
}