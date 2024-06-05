package com.bcforum.demo_exercise2_bcforum.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.bcforum.demo_exercise2_bcforum.Model.Comments;
import com.bcforum.demo_exercise2_bcforum.Model.Posts;
import com.bcforum.demo_exercise2_bcforum.Entity.PostEntity;
import com.bcforum.demo_exercise2_bcforum.Entity.UserEntity;
import com.bcforum.demo_exercise2_bcforum.Infra.Scheme;
import com.bcforum.demo_exercise2_bcforum.service.UserService;
import lombok.Value;

@Service
public class UserServiceImpl implements UserService {

  @Value(value = "${api.json-place-holder.domain}")
  private String domain;

  @Value(value = "${api.json-place-holder.endpoints.users}")
  private String usersEndpoint;

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public List<User> getUsers() {
    String url = UriComponentsBuilder.newInstance()//
        .scheme(Scheme.HTTPS.lowercase()) //
        .host(this.domain)//
        .path(this.usersEndpoint)//
        .toUriString();

    User[] users = restTemplate.getForObject(url, User[].class);
    return Arrays.asList(users);
  }

  @Override
  public List<Posts> getPosts() {
    String url = UriComponentsBuilder.newInstance()//
        .scheme(Scheme.HTTPS.lowercase())//
        .host(this.domain)//
        .path(this.usersEndpoint)//
        .toUriString();

    Posts[] posts = restTemplate.getForObject(url, Posts[].class);
    return Arrays.asList(posts);
  }

  @Override
  public List<Comments> getComments() {
    String url = UriComponentsBuilder.newInstance()//
        .scheme(Scheme.HTTPS.lowercase())//
        .host(this.domain)//
        .path(this.usersEndpoint)//
        .toUriString();

    Comments[] comments = restTemplate.getForObject(url, Comments[].class);
    return Arrays.asList(comments);
  }

  public UserEntity getUserWithPostAndComment(Long userId) {
    Optional<User> user = getUsers().stream()//
        .filter(u -> u.getId().equals(userId))//
        .findFirst();

    return user.empty();
  }

  

}
