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
public class User {
  private Long id;
  private String name;
  private String username;
  private String email;
  private List<Posts> posts;
}
