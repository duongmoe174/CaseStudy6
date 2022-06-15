package com.duong.casemodule6.service.comment;

import com.duong.casemodule6.entity.comment.Comment;
import com.duong.casemodule6.repository.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService implements ICommentService{
    @Autowired
    private ICommentRepository commentRepository;

    @Override
    public Iterable<Comment> findAll() {
        return commentRepository.findAll();
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return commentRepository.findById(id);
    }

    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void remove(Long id) {
        commentRepository.deleteById(id);
    }

    @Override
    public Iterable<Comment> get3CommentByHouseId(Long id) {
        return commentRepository.get3CommentByHouseId(id);
    }

    @Override
    public Iterable<Comment> getAllCommentByHouseId(Long id) {
        return commentRepository.getAllCommentByHouseId(id);
    }
}
