package com.notgod.streamIo.service;

import com.notgod.streamIo.model.Video;
import com.notgod.streamIo.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class VideoService {

    private final S3Service s3Service;
    private final VideoRepository videoRepository;

    @Autowired
    public VideoService(S3Service s3Service, VideoRepository videoRepository) {
        this.s3Service = s3Service;
        this.videoRepository = videoRepository;
    }


    public void uploadVideo(MultipartFile multipartFile){

        String videoUrl = s3Service.uploadFile(multipartFile);
        var video = new Video();
        video.setVideoUrl(videoUrl);

        videoRepository.save(video);
    }
}
