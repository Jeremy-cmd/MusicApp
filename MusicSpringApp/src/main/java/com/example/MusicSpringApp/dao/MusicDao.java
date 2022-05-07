package com.example.MusicSpringApp.dao;

import com.example.MusicSpringApp.dto.TrackPodcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicDao extends JpaRepository<TrackPodcast, Integer> {

}
