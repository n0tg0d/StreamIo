package com.notgod.StreamIo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "text")
    private String text;

    @Column(name = "authorId")
    private String authorId;

    @Column(name = "likecount")
    private Integer likeCount;

    @Column(name = "dislikecount")
    private Integer dislikeCount;

    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

}
