package com.jaeyoon.blog.presentation.controller;

import com.jaeyoon.blog.domain.constant.SkillType;
import com.jaeyoon.blog.presentation.service.PresentationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PresentationViewController {

    private final PresentationService presentationService;

    public PresentationViewController(PresentationService presentationService) {
        this.presentationService = presentationService;
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("introductions", presentationService.getIntroductions());
        model.addAttribute("links", presentationService.getLinks());
        return "presentation/index";
    }

    @GetMapping("/resume")
    public String resume(Model model) {
        model.addAttribute("resume", presentationService.getResume());
        model.addAttribute("skillTypes", SkillType.values());
        return "presentation/resume";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("projects", presentationService.getProjects());
        return "presentation/projects";
    }
}
