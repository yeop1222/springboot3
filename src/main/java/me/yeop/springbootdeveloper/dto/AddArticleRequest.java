package me.yeop.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.yeop.springbootdeveloper.domain.Article;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {

    private String title;
    private String content;

    // 생성자 사용해서 객체 생성
    public Article toEntity() {
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
