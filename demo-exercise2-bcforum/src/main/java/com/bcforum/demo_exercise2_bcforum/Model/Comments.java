package com.bcforum.demo_exercise2_bcforum.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Setter
public class Comments {

  private Long id;
  private Long postId;
  private String name;
  private String email;
  private String body;
}
