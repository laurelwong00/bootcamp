package com.bcforum.demo_exercise2_bcforum.Entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Builder
@Table(name = "posts")
public class PostEntity {

    @Id
    private Long id;
    private String title;
    private String body;
    private UserEntity user;
    private List<CommentEntity> comments;
}