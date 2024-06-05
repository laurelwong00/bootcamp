package com.bcforum.demo_exercise2_bcforum.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
@Table(name = "Comments")
public class CommentEntity {
  @Id
  private Long id;

  private String name;
  private String email;
  private String body;
  private PostEntity post;
}
