package com.notgod.StreamIo.model;

import com.notgod.StreamIo.enums.VideoStatus;
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
@Table(name = "video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "userId")
    private String userId;

    @Column(name = "likes")
    private String likes;

    @Column(name = "dislikes")
    private String dislikes;

    @Column(name = "tags")
    private Set<String> tags;

    @Column(name = "videoUrl")
    private String videoUrl;

    @Column(name = "videoStatus")
    private VideoStatus videoStatus;

    @Column(name = "viewCounts")
    private Integer viewCounts;

    @Column(name = "thumbnailUrl")
    private String thumbnailUrl;

    @Column(name = "commentList")
    @OneToMany(mappedBy = "video")
    private List<Comment> commentList;

}
