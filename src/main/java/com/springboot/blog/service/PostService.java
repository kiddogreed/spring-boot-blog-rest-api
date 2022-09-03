package com.springboot.blog.service;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;

import java.util.List;

public interface PostService {
     PostDto createPost(PostDto postDto);


     //create getAll method for controller
     //then create implementation method in impl
     PostResponse geAllPosts(int pageNo, int pageSize, String sortBy, String sortDir);
     //create GetPostById method
     PostDto getPostById(long id);

     //create updatePost
     PostDto updatePost(PostDto postDto, long id);

     //method for delete post
     void  deletePostById(long id);

}
