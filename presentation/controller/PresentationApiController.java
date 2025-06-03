package com.jaeyoon.blog.presentation.controller;

import com.jaeyoon.blog.presentation.dto.IntroductionDTO;
import com.jaeyoon.blog.presentation.dto.LinkDTO;
import com.jaeyoon.blog.presentation.dto.ProjectDTO;
import com.jaeyoon.blog.presentation.dto.ResumeDTO;
import com.jaeyoon.blog.presentation.service.PresentationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PresentationApiController {

    private final PresentationService presentationService;

    public PresentationApiController(PresentationService presentationService) {
        this.presentationService = presentationService;
    }

    @GetMapping("/test")
    public String test() {
        return "OK";
    }

    @GetMapping("/v1/introductions")
    public List<IntroductionDTO> getIntroductions() {
        return presentationService.getIntroductions();
    }

    @GetMapping("/v1/links")
    public List<LinkDTO> getLinks() {
        return presentationService.getLinks();
    }

    @GetMapping("/v1/resume")
    public ResumeDTO getResume() {
        return presentationService.getResume();
    }

    @GetMapping("/v1/projects")
    public List<ProjectDTO> getProjects() {
        return presentationService.getProjects();
    }
}
