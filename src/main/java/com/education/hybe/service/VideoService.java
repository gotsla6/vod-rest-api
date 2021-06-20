package com.education.hybe.service;

import com.education.hybe.domain.Video;

import java.util.List;

public interface VideoService {

    public List<Video> findVideoList(Integer chapterId);

    public List<Video> searchTitleVideo(String title);

    public List<Video> searchTagVideo(String tag);
}
