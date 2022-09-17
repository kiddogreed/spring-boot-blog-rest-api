package com.springboot.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "comments")
public class Comment {
    //decide fields
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    //ignore @column annotation and autogenerate column with same name given
    private long id;
    private String name;
    private  String email;
    private String body;

    //add relation annotation
    @ManyToOne(fetch = FetchType.LAZY)
    //to only fetch related return value
    //multiple comments belong to one post

    //to specify foreign key
    @JoinColumn(name = "post_id", nullable = false)


    private  Post post;
}
