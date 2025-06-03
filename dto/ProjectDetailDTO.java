package com.jaeyoon.blog.presentation.dto;

public class ProjectDetailDTO {
    private String content;
    private String url;

    public ProjectDetailDTO(String content, String url) {
        this.content = content;
        this.url = url;
    }

    public String getContent() { return content; }
    public String getUrl() { return url; }

    public void setContent(String content) { this.content = content; }
    public void setUrl(String url) { this.url = url; }
}
