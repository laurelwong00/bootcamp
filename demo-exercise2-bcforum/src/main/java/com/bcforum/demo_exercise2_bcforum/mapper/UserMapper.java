package com.bcforum.demo_exercise2_bcforum.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.bcforum.demo_exercise2_bcforum.Entity.CommentEntity;
import com.bcforum.demo_exercise2_bcforum.Entity.PostEntity;
import com.bcforum.demo_exercise2_bcforum.Entity.UserEntity;
import com.bcforum.demo_exercise2_bcforum.Model.Comments;
import com.bcforum.demo_exercise2_bcforum.Model.Posts;
import com.bcforum.demo_exercise2_bcforum.Model.User;

public class UserMapper {

  public static UserEntity toEntity(User user, List<PostEntity> posts) {
      if (user == null) {
          return null;
      }

      return UserEntity.builder()
              .id(user.getId())
              .name(user.getName())
              .username(user.getUsername())
              .email(user.getEmail())
              .posts(posts)
              .build();
  }

  public static User toDto(UserEntity userEntity) {
      if (userEntity == null) {
          return null;
      }

      return User.builder()
              .id(userEntity.getId())
              .name(userEntity.getName())
              .username(userEntity.getUsername())
              .email(userEntity.getEmail())
              .build();
  }

  public static List<User> toDtoList(List<UserEntity> userEntities) {
      return userEntities.stream()
              .map(UserMapper::toDto)
              .collect(Collectors.toList());
  }

  public static PostEntity toEntity(Posts post, UserEntity user, List<CommentEntity> comments) {
      if (post == null) {
          return null;
      }

      return PostEntity.builder()
              .id(post.getId())
              .title(post.getTitle())
              .body(post.getBody())
              .user(user)
              .comments(comments)
              .build();
  }

  public static Posts toDto(PostEntity postEntity) {
      if (postEntity == null) {
          return null;
      }

      return Posts.builder()
              .id(postEntity.getId())
              .userId(postEntity.getUser().getId())
              .title(postEntity.getTitle())
              .body(postEntity.getBody())
              .build();
  }

  public static CommentEntity toEntity(Comments comment, PostEntity post) {
      if (comment == null) {
          return null;
      }

      return CommentEntity.builder()
              .id(comment.getId())
              .name(comment.getName())
              .email(comment.getEmail())
              .body(comment.getBody())
              .post(post)
              .build();
  }

  public static Comments toDto(CommentEntity commentEntity) {
      if (commentEntity == null) {
          return null;
      }

      return Comments.builder()//
              .id(commentEntity.getId())
              .postId(commentEntity.getPost().getId())
              .name(commentEntity.getName())
              .email(commentEntity.getEmail())
              .body(commentEntity.getBody())
              .build();
  }
}
  


  // public UserDTO map(User user) {
  //   LocationDTO locationDTO = LocationDTO.builder() //
  //       .latitude(user.getAddress().getGeo().getLatitude())
  //       .longitude(user.getAddress().getGeo().getLongitude()).build();

  //   AddressDTO addressDTO = AddressDTO.builder() //
  //       .city(user.getAddress().getCity()) //
  //       .street(user.getAddress().getStreet()) //
  //       .suite(user.getAddress().getSuite()) //
  //       .geo(locationDTO) //
  //       .build();

  //   CompanyDTO companyDTO = CompanyDTO.builder() //
  //       .name(user.getCompany().getName()) //
  //       .business(user.getCompany().getBusiness()) //
  //       .build();

  //   return UserDTO.builder() //
  //       .id(user.getId()) //
  //       .name(user.getName()) //
  //       .address(addressDTO) //
  //       .company(companyDTO) //
  //       .build();
  }

}
