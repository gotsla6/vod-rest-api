package com.education.hybe.repository;

import com.education.hybe.domain.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {

    public List<Chapter> findByPackageId(Integer packageId);
}
