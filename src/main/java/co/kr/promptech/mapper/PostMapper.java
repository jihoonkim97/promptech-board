package co.kr.promptech.mapper;

import co.kr.promptech.model.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    List<PostVO> getPostList();
    void createPost(PostVO post);
}
