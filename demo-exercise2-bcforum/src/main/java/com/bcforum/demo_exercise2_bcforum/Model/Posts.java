package com.bcforum.demo_exercise2_bcforum.Model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Posts {
    
    private Long id;
    private Long userId;
    private String title;
    private String body;
    private List<Comments> comments;
}
