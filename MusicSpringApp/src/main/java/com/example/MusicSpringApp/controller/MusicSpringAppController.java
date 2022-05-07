package com.example.MusicSpringApp.controller;

import com.example.MusicSpringApp.dto.TrackPodcast;
import com.example.MusicSpringApp.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/music")
@CrossOrigin
public class MusicSpringAppController {

    @Autowired
    MusicService musicService;

    @GetMapping("/getMusic")
    public List<TrackPodcast> getAll() {
        return musicService.getAll();
    }




}
