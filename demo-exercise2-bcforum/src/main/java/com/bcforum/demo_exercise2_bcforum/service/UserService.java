package com.bcforum.demo_exercise2_bcforum.service;

import java.util.List;

import org.apache.catalina.User;

import com.bcforum.demo_exercise2_bcforum.Model.Posts;
import com.bcforum.demo_exercise2_bcforum.Entity.UserEntity;
import com.bcforum.demo_exercise2_bcforum.Model.Comments;

public interface UserService {
  
  List<User> getUsers();

  List<Comments> getComments();

  List<Posts> getPosts();

  UserEntity getUserWithPostAndComment(Long userId);
}
