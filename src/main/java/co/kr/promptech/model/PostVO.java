package co.kr.promptech.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class PostVO {
    int id;
    String title;
    String contents;
    String writer;
    LocalDateTime time;
}