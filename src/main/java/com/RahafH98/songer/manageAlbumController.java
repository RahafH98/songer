package com.RahafH98.songer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@RequestMapping("/albums")
public class manageAlbumController {


    @Autowired
    private AlbumRepository albumRepository;

    @GetMapping
    public String listAlbums(Model model) {
        List<Album> albums = albumRepository.findAll();
        model.addAttribute("albums", albums);
        return "Album";
    }

    @PostMapping("/add")
    public String addAlbum(@ModelAttribute Album album) {
        albumRepository.save(album);
        return "redirect:/albums";
    }

}

