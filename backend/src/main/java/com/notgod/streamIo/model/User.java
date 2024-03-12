package com.notgod.streamIo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "emailAdress")
    private  String emailAddress;

    @Column(name = "subscribed")
    private Set<String> subscribedToUsers;

    @Column(name = "subscribers")
    private  Set<String> subscribers;

    @Column(name = "videoHstory")
    private List<String> videoHistory;

    @Column(name = "liked")
    private Set<String> likedVideos;

    @Column(name = "disliked")
    private Set<String> dislikedVideos;
}
