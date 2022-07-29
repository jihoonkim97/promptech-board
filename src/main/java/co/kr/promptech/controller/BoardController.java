package co.kr.promptech.controller;

import co.kr.promptech.model.PostVO;
import co.kr.promptech.service.PostService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequiredArgsConstructor
@Controller
public class BoardController {

    private final PostService postService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping ("/")
    public String board(Model model){
        model.addAttribute("postList", postService.getPostList());

        return "board";
    }

    @GetMapping("/createPost")
    public String createPost(){
        return "createPost";
    }

    @PostMapping("/createPost")
    public String createPost(PostVO post){
        //service
        return "createPost";
    }
}
