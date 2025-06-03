package com.jaeyoon.blog.presentation.repository;

import com.jaeyoon.blog.domain.entity.Achievement;
import com.jaeyoon.blog.domain.entity.Experience;
import com.jaeyoon.blog.domain.entity.Introduction;
import com.jaeyoon.blog.domain.entity.Link;
import com.jaeyoon.blog.domain.entity.Project;
import com.jaeyoon.blog.domain.entity.Skill;
import com.jaeyoon.blog.domain.repository.AchievementRepository;
import com.jaeyoon.blog.domain.repository.ExperienceRepository;
import com.jaeyoon.blog.domain.repository.IntroductionRepository;
import com.jaeyoon.blog.domain.repository.LinkRepository;
import com.jaeyoon.blog.domain.repository.ProjectRepository;
import com.jaeyoon.blog.domain.repository.SkillRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PresentationRepository {

    private final AchievementRepository achievementRepository;
    private final ExperienceRepository experienceRepository;
    private final IntroductionRepository introductionRepository;
    private final LinkRepository linkRepository;
    private final ProjectRepository projectRepository;
    private final SkillRepository skillRepository;

    public PresentationRepository(AchievementRepository achievementRepository,
                                  ExperienceRepository experienceRepository,
                                  IntroductionRepository introductionRepository,
                                  LinkRepository linkRepository,
                                  ProjectRepository projectRepository,
                                  SkillRepository skillRepository) {
        this.achievementRepository = achievementRepository;
        this.experienceRepository = experienceRepository;
        this.introductionRepository = introductionRepository;
        this.linkRepository = linkRepository;
        this.projectRepository = projectRepository;
        this.skillRepository = skillRepository;
    }

    public List<Achievement> getActiveAchievements() {
        return achievementRepository.findAllByIsActive(true);
    }

    public List<Experience> getActiveExperiences() {
        return experienceRepository.findAllByIsActive(true);
    }

    public List<Introduction> getActiveIntroductions() {
        return introductionRepository.findAllByIsActive(true);
    }

    public List<Link> getActiveLinks() {
        return linkRepository.findAllByIsActive(true);
    }

    public List<Project> getActiveProjects() {
        return projectRepository.findAllByIsActive(true);
    }

    public List<Skill> getActiveSkills() {
        return skillRepository.findAllByIsActive(true);
    }
}
