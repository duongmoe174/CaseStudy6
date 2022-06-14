package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.comment.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentRepository extends JpaRepository<Comment, Long> {

    @Query(value = "SELECT * FROM comments WHERE house_id = ?1 ORDER BY count_like DESC LIMIT 3", nativeQuery = true)
    Iterable<Comment> get3CommentByHouseId(Long id);

    @Query(value = "SELECT * FROM comments WHERE house_id = ?1 ORDER BY create_time DESC", nativeQuery = true)
    Iterable<Comment> getAllCommentByHouseId(Long id);
}
