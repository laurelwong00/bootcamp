package com.bcforum.demo_exercise2_bcforum.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Entity
@Table(name = "Users")
public class UserEntity {

  @Id
  private Long id;

  private String name;
  private String username;
  private String email;

  private List<PostEntity> posts;
}
