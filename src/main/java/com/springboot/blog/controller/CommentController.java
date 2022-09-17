package com.springboot.blog.controller;

import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.service.CommentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class CommentController {
    private CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    //create comment
    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(
            @PathVariable(value = "postId") long postId,
            @RequestBody CommentDto commentDto){

        return new ResponseEntity<>(commentService.createComment(postId,commentDto), HttpStatus.CREATED);
    }


    //get all comments by id
    @GetMapping("/posts/{postId}/comments")
    public List<CommentDto> getCommentsById(
            @PathVariable(name = "postId") long postId){

        return commentService.getCommentsByPostId(postId);

    }


    //get post by id

    @GetMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> getCommentById(
            @PathVariable(value = "postId") long postId,
            @PathVariable(value = "id") long commentId)
    {
        CommentDto commentDto = commentService.getCommentById(postId,commentId);
        return  new ResponseEntity<>(commentDto, HttpStatus.OK);
    }

        //return ResponseEntity<>(commentService.getC(postId,commentDto), HttpStatus.CREATED);

    @PutMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<CommentDto> updateComment(
            @PathVariable(value = "postId") long postId,
            @PathVariable(value = "id") long commentId,
            @RequestBody CommentDto commentDto){

        CommentDto updateComment = commentService.updateComment(postId, commentId, commentDto);
        return  new ResponseEntity<>(commentDto, HttpStatus.OK);
    }

    @DeleteMapping("/posts/{postId}/comments/{id}")
    public ResponseEntity<String> deleteComment(
            @PathVariable(value = "postId") long postId,
            @PathVariable(value = "id") long commentId){
        commentService.deleteComment(postId, commentId);
        return  new ResponseEntity<>("Comment deleted successfully", HttpStatus.OK);
    }
}
