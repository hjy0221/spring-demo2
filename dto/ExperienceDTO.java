package com.jaeyoon.blog.presentation.dto;

import java.util.List;

public class ExperienceDTO {
    private String title;
    private String description;
    private String startYearMonth;
    private String endYearMonth;
    private List<String> details;

    public ExperienceDTO(String title, String description, String startYearMonth, String endYearMonth, List<String> details) {
        this.title = title;
        this.description = description;
        this.startYearMonth = startYearMonth;
        this.endYearMonth = endYearMonth;
        this.details = details;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getStartYearMonth() { return startYearMonth; }
    public String getEndYearMonth() { return endYearMonth; }
    public List<String> getDetails() { return details; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setStartYearMonth(String startYearMonth) { this.startYearMonth = startYearMonth; }
    public void setEndYearMonth(String endYearMonth) { this.endYearMonth = endYearMonth; }
    public void setDetails(List<String> details) { this.details = details; }
}
