package com.duong.casemodule6.controller;

import com.duong.casemodule6.entity.comment.Comment;
import com.duong.casemodule6.service.comment.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Optional;

@RestController
@RequestMapping("/comments")
@CrossOrigin("*")
public class CommentController {
    @Autowired
    private ICommentService commentService;

    @GetMapping
    public ResponseEntity<Iterable<Comment>> getAllCommentByHouseId(@RequestParam(name = "id") Long houseId) {
        return new ResponseEntity<>(commentService.getAllCommentByHouseId(houseId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Comment> addNewComment(@RequestBody Comment comment) {
        Date date = new Date();
        Comment newComment = new Comment(comment.getText(),comment.getUser(),comment.getHouse(),date,0L,0L);
        return new ResponseEntity<>(commentService.save(newComment), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Comment> editComment(@PathVariable Long id, @RequestBody Comment comment) {
        Optional<Comment> optionalComment = commentService.findById(id);
        if (!optionalComment.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        Comment editedComment = new Comment(id, comment.getText(),comment.getUser(),comment.getHouse(),comment.getCreateTime(),0L,0L);
        return new ResponseEntity<>(commentService.save(editedComment), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Comment> deleteComment(@PathVariable Long id) {
        Optional<Comment> optionalComment = commentService.findById(id);
        if (!optionalComment.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        commentService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
