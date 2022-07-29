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
}
