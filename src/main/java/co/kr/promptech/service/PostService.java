package co.kr.promptech.service;

import co.kr.promptech.mapper.PostMapper;
import co.kr.promptech.model.PostVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostMapper postMapper;

    public List<PostVO> getPostList(){
        return postMapper.getPostList();
    }

    public PostVO getPost(int postId){
        return postMapper.getPost(postId);
    }

    public void createPost(PostVO post){
        postMapper.createPost(post);
    }

    public void updatePost(PostVO post){
        postMapper.updatePost(post);
    }

    public void deletePost(int postId){
        postMapper.deletePost(postId);
    }
}
