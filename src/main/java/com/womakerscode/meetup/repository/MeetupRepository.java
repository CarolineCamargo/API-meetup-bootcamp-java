package com.womakerscode.meetup.repository;

import com.womakerscode.meetup.model.entity.Meetup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeetupRepository extends JpaRepository<Meetup, Integer> {

}
