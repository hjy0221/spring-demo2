package com.jaeyoon.blog.presentation.dto;

import com.jaeyoon.blog.domain.entity.Link;

public class LinkDTO {
    private String name;
    private String content;

    public LinkDTO(String name, String content) {
        this.name = name.toLowerCase();
        this.content = content;
    }

    public LinkDTO(Link link) {
        this.name = link.getName().toLowerCase();
        this.content = link.getContent();
    }

    public String getName() { return name; }
    public String getContent() { return content; }

    public void setName(String name) { this.name = name.toLowerCase(); }
    public void setContent(String content) { this.content = content; }
}
