package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto  {
    private long id;

    //title should not be null or empty
    //title at least have 2 char
    @NotEmpty
    @Size(min=2, message = "title should have at least 2 characters")
    private String title;
    //title should not be null or empty
    //title at least have 10char
    @NotEmpty
    @Size(min = 10, message = "description should have at least 10 characters")
    private String description;

    //title should not be null or empty
    //title at least have 10char
    @NotEmpty
    private String content;


    //added comment
    private Set<CommentDto> comments;

}
