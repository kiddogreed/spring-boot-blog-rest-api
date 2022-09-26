package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {

    private long id;
    //name should not null or empty

    @NotEmpty(message = "Name should not be Null or Empty")
    private String name;

    //email should not be empty
    //valid email
     @NotEmpty(message = "Email should not be Null or Empty")
     @Email(message = "Email must be Valid")
    private String email;

     //Should not be Empty
    //min of 10 char
    @NotEmpty(message = " Must not be empty")
    @Size(min = 10,message = "Minimum of 10 charater")
    private String body;
}
