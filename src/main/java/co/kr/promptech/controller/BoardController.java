package co.kr.promptech.controller;

import co.kr.promptech.model.PostVO;
import co.kr.promptech.service.PostService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


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

    @RequestMapping("/createPost")
    public String createPost(){
        return "createPost";
    }

    @RequestMapping(value="/createPost", method = RequestMethod.POST)
    public String createPost(PostVO post){
        postService.createPost(post);

        return "redirect:/";
    }

    @RequestMapping("/postDetail/{postId}")
    public String postDetail(Model model, @PathVariable int postId){
        model.addAttribute("post", postService.getPost(postId));

        return "postDetail";
    }

    @RequestMapping("/updatePost/{postId}")
    public String updatePost(Model model, @PathVariable int postId){
        model.addAttribute("post", postService.getPost(postId));

        return "updatePost";
    }

    @RequestMapping("/updatePost")
    public String updatePost(PostVO post){
        postService.updatePost(post);

        return "redirect:/postDetail/"+post.getId();
    }

    @RequestMapping("/deletePost/{postId}")
    public String deletePost(@PathVariable int postId){
        postService.deletePost(postId);

        return "redirect:/";
    }
}
