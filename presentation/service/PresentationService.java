package com.jaeyoon.blog.presentation.service;

import com.jaeyoon.blog.presentation.dto.IntroductionDTO;
import com.jaeyoon.blog.presentation.dto.LinkDTO;
import com.jaeyoon.blog.presentation.dto.ProjectDTO;
import com.jaeyoon.blog.presentation.dto.ResumeDTO;
import com.jaeyoon.blog.presentation.repository.PresentationRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PresentationService {

    private final PresentationRepository presentationRepository;

    public PresentationService(PresentationRepository presentationRepository) {
        this.presentationRepository = presentationRepository;
    }

    @Transactional(readOnly = true)
    public List<IntroductionDTO> getIntroductions() {
        return presentationRepository.getActiveIntroductions()
                .stream()
                .map(IntroductionDTO::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<LinkDTO> getLinks() {
        return presentationRepository.getActiveLinks()
                .stream()
                .map(LinkDTO::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ResumeDTO getResume() {
        return new ResumeDTO(
            presentationRepository.getActiveExperiences(),
            presentationRepository.getActiveAchievements(),
            presentationRepository.getActiveSkills()
        );
    }

    @Transactional(readOnly = true)
    public List<ProjectDTO> getProjects() {
        return presentationRepository.getActiveProjects()
                .stream()
                .map(ProjectDTO::new)
                .collect(Collectors.toList());
    }
}
