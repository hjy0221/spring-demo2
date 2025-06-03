package com.jaeyoon.blog.presentation.dto;

import java.util.List;

public class ProjectDTO {
    private String name;
    private String description;
    private String startYearMonth;
    private String endYearMonth;
    private List<ProjectDetailDTO> details;
    private List<SkillDTO> skills;

    public ProjectDTO(String name, String description, String startYearMonth, String endYearMonth,
                      List<ProjectDetailDTO> details, List<SkillDTO> skills) {
        this.name = name;
        this.description = description;
        this.startYearMonth = startYearMonth;
        this.endYearMonth = endYearMonth;
        this.details = details;
        this.skills = skills;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getStartYearMonth() { return startYearMonth; }
    public String getEndYearMonth() { return endYearMonth; }
    public List<ProjectDetailDTO> getDetails() { return details; }
    public List<SkillDTO> getSkills() { return skills; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setStartYearMonth(String startYearMonth) { this.startYearMonth = startYearMonth; }
    public void setEndYearMonth(String endYearMonth) { this.endYearMonth = endYearMonth; }
    public void setDetails(List<ProjectDetailDTO> details) { this.details = details; }
    public void setSkills(List<SkillDTO> skills) { this.skills = skills; }
}
