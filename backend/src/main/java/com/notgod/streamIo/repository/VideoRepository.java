package com.notgod.streamIo.repository;

import com.notgod.streamIo.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, String> {
}
