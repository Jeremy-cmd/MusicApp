package com.example.MusicSpringApp.service;

import com.example.MusicSpringApp.dao.MusicDao;
import com.example.MusicSpringApp.dto.TrackPodcast;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicServiceImpl implements MusicService {

    @Autowired
    MusicDao dao;

    @Override
    public TrackPodcast add(TrackPodcast trackPodcast) {
        return dao.save(trackPodcast);
    }

    @Override
    public void delete(int id) {
        dao.deleteById(id);
    }

    @Override
    public List<TrackPodcast> getAll() {
        return dao.findAll();
    }


}
