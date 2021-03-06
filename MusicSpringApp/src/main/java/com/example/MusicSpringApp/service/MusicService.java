package com.example.MusicSpringApp.service;

import com.example.MusicSpringApp.dto.TrackPodcast;

import java.util.List;

public interface MusicService {

    public TrackPodcast add(TrackPodcast trackPodcast);

    public void delete(int id);

    public List<TrackPodcast> getAll();
}
