package co.kr.promptech.mapper;

import co.kr.promptech.model.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    List<PostVO> getPostList();
    PostVO getPost(int postId);
    void createPost(PostVO post);
    void updatePost(PostVO post);
    void deletePost(int postId);
}
