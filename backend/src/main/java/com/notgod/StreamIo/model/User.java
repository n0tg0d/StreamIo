package com.notgod.StreamIo.model;

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

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "emailadress")
    private  String emailAddress;

    @Column(name = "subscribed")
    private Set<String> subscribedToUsers;

    @Column(name = "subscribers")
    private  Set<String> subscribers;

    @Column(name = "videohistory")
    private List<String> videoHistory;

    @Column(name = "liked")
    private Set<String> likedVideos;

    @Column(name = "disliked")
    private Set<String> dislikedVideos;
}
