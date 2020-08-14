package com.ssafy.study.repository;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

import com.ssafy.study.model.Member;
import com.ssafy.study.model.Studyroom;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ssafy.study.model.Feed;

public interface FeedRepository extends JpaRepository<Feed, Long> {
	Optional<Feed> findById(Long id);
	Collection<Feed> findAllByOrderByRegistTimeDesc();
	Collection<Feed> findAllByOrderByRegistTimeAsc();
	Collection<Feed> findAllByStudyroom(Studyroom studyroom);
	Collection<Feed> findAllByMember(Member member);
	void deleteAllByStudyroom(Studyroom studyroom);
	void deleteAllByMember(Member member);
	Collection<Feed> findAllByRegistTimeGreaterThan(Date date);
	Collection<Feed> findAllByStudyroomAndMember(Studyroom studyroom, Member member);
}
