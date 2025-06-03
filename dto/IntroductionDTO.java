package com.jaeyoon.blog.presentation.dto;

public class IntroductionDTO {
    private String content;

    public IntroductionDTO(String content) {
        this.content = content;
    }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}
