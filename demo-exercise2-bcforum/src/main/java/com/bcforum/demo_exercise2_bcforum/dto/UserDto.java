package com.bcforum.demo_exercise2_bcforum.dto;

import lombok.Builder;
import lombok.Getter;

public class UserDto {
  private Long id;
  private String name;
  private String username;
  private String email;
  private PostDto postDto;

  @Builder
  @Getter
  public static class PostDto {
    private Long id;
    private Long userId;
    private String title;
    private String body;
    private CommentDto commentDto;

    @Builder
    @Getter
    public static class CommentDto {
      private Long id;
      private Long postId;
      private String name;
      private String email;
      private String body;
    }
  }
}
