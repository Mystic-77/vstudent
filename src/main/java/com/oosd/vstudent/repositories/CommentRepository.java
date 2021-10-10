package com.oosd.vstudent.repositories;

import com.oosd.vstudent.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    public List<Comment> getCommentsByPostOrderByTimestamp(@Param("post_id") int postId);
}
