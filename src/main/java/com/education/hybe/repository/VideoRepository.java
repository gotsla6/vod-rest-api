package com.education.hybe.repository;

import com.education.hybe.domain.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {
    public List<Video> findByChapterId(Integer chapterId);

    public List<Video> findByNameContaining(String name);

    public List<Video> findByTagsContaining(String tag);
}
