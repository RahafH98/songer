package com.RahafH98.songer;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Controller
public class AlbumController {
    @GetMapping("/albums")
    public String listAlbums(Model model) {

        List<Album> albums = Arrays.asList(
                new Album("The weekend", "Artist1", 10, 300, "https://i.pinimg.com/564x/a4/58/69/a4586918f67f954f6a0f8ae00e0c50ab.jpg"),

                new Album("Drake", "Artist2", 12, 360, "https://i.pinimg.com/564x/f2/9a/7a/f29a7ab95820258fcd3888c314657445.jpg"),

                new Album("Kindrek Lamar ", "Artist3", 8, 240, "https://i.pinimg.com/564x/64/f1/5b/64f15b378b614c7ca5883d713ea7fc98.jpg")
        );

        model.addAttribute("albums", albums);
        return "Album";
    }

}
