package com.education.hybe.service;

import com.education.hybe.domain.Video;
import com.education.hybe.repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoRepository videoRepository;

    @Override
    public List<Video> findVideoList(Integer chapterId) {

        return videoRepository.findByChapterId(chapterId);
    }

    @Override
    public List<Video> searchTitleVideo(String title) {

        return videoRepository.findByNameContaining(title);
    }

    @Override
    public List<Video> searchTagVideo(String tag) {

        return videoRepository.findByTagsContaining(tag);
    }


}
