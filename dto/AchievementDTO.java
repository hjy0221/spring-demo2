package com.jaeyoon.blog.presentation.dto;

public class AchievementDTO {
    private String title;
    private String description;
    private String host;
    private String achievedDate;

    public AchievementDTO(String title, String description, String host, String achievedDate) {
        this.title = title;
        this.description = description;
        this.host = host;
        this.achievedDate = achievedDate;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getHost() { return host; }
    public String getAchievedDate() { return achievedDate; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setHost(String host) { this.host = host; }
    public void setAchievedDate(String achievedDate) { this.achievedDate = achievedDate; }
}
