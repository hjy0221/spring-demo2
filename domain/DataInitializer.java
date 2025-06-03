package com.jaeyoon.blog.domain;

import com.jaeyoon.blog.domain.constant.SkillType;
import com.jaeyoon.blog.domain.entity.*;
import com.jaeyoon.blog.domain.repository.*;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
@Profile("default")
public class DataInitializer {

    private static final Logger log = LoggerFactory.getLogger(DataInitializer.class);

    private final AchievementRepository achievementRepository;
    private final ExperienceRepository experienceRepository;
    private final IntroductionRepository introductionRepository;
    private final LinkRepository linkRepository;
    private final ProjectRepository projectRepository;
    private final SkillRepository skillRepository;
    private final AccountRepository accountRepository;

    public DataInitializer(AchievementRepository achievementRepository,
                           ExperienceRepository experienceRepository,
                           IntroductionRepository introductionRepository,
                           LinkRepository linkRepository,
                           ProjectRepository projectRepository,
                           SkillRepository skillRepository,
                           AccountRepository accountRepository) {
        this.achievementRepository = achievementRepository;
        this.experienceRepository = experienceRepository;
        this.introductionRepository = introductionRepository;
        this.linkRepository = linkRepository;
        this.projectRepository = projectRepository;
        this.skillRepository = skillRepository;
        this.accountRepository = accountRepository;
    }

    @PostConstruct
    public void initializeData() {
        log.info("스프링이 실행되었습니다. 테스트 데이터를 초기화합니다.");

        List<Achievement> achievements = Arrays.asList(
            new Achievement("2022 SW중심대학 해커톤 최우수상", "고양이 쇼핑몰 검색 서비스의 아키텍처, 데이터 모델링, API 개발 역할 수행", "네카오", LocalDate.of(2025, 8, 1), true),
            new Achievement("정보처리기사", "자료구조, 운영체제, 알고리즘, 데이터베이스 등", "한국산업인력공단", LocalDate.of(2025, 2, 2), true)
        );
        achievementRepository.saveAll(achievements);

        List<Introduction> introductions = Arrays.asList(
            new Introduction("주도적으로 문제를 찾고, 해결하는 사람입니다.", true),
            new Introduction("기술을 위한 기술이 아닌, 비즈니스 문제를 풀기 위한 기술을 추구합니다.", true),
            new Introduction("기존 소스를 리팩토링하여 더 좋은 구조로 개선하는 작업을 좋아합니다.", true)
        );
        introductionRepository.saveAll(introductions);

        List<Link> links = Arrays.asList(
            new Link("Github", "https://github.com/google", true),
            new Link("Linkedin", "https://www.linkedin.com/in/jeff-dean-8b212555/", true)
        );
        linkRepository.saveAll(links);

        Experience experience1 = new Experience("한국대학교(Korea National Univ.)", "컴퓨터공학 전공", 2018, 9, 2025, 8, true);
        experience1.addDetails(Arrays.asList(
            new ExperienceDetail("GPA 4.3/4.5", true),
            new ExperienceDetail("운영체제 학회 활동", true)
        ));
        Experience experience2 = new Experience("주식회사 네카오(Nakao Corp.)", "라이브방송 백엔드 개발자", 2025, 9, null, null, true);
        experience2.addDetails(Arrays.asList(
            new ExperienceDetail("유기모 발견 정보 공유 서비스 개발", true),
            new ExperienceDetail("신입 교육 프로그램 우수상 수상", true)
        ));
        experienceRepository.saveAll(Arrays.asList(experience1, experience2));

        Skill java = new Skill("Java", SkillType.LANGUAGE.name(), true);
        Skill kotlin = new Skill("Kotlin", SkillType.LANGUAGE.name(), true);
        Skill python = new Skill("Python", SkillType.LANGUAGE.name(), true);
        Skill spring = new Skill("Spring", SkillType.FRAMEWORK.name(), true);
        Skill django = new Skill("Django", SkillType.FRAMEWORK.name(), true);
        Skill mysql = new Skill("MySQL", SkillType.DATABASE.name(), true);
        Skill redis = new Skill("Redis", SkillType.DATABASE.name(), true);
        Skill kafka = new Skill("Kafka", SkillType.TOOL.name(), true);
        skillRepository.saveAll(Arrays.asList(java, kotlin, python, spring, django, mysql, redis, kafka));

        Project project1 = new Project("유기묘 발견 정보 공유 서비스", "유기묘 위치의 실시간 공유...", 2024, 9, 2024, 12, true);
        project1.addDetails(Arrays.asList(
            new ProjectDetail("구글 맵스를 활용한 유기묘 발견 지역 정보 제공 API 개발", null, true),
            new ProjectDetail("Redis 적용하여 인기 게시글의 조회 속도 1.5초 → 0.5초로 개선", null, true)
        ));
        project1.getSkills().addAll(Arrays.asList(
            new ProjectSkill(project1, java),
            new ProjectSkill(project1, spring),
            new ProjectSkill(project1, mysql),
            new ProjectSkill(project1, redis)
        ));

        Project project2 = new Project("반려동물 홈 카메라 움직임 감지 분석 모듈", "카메라에서 서버로 전달되는 신호를 분석...", 2024, 12, null, null, true);
        project2.addDetails(Arrays.asList(
            new ProjectDetail("PIL(Pillow) 활용하여 이미지 분석 기능 개발", null, true),
            new ProjectDetail("알림 발송을 비동기 처리하여 이미지 분석 - 알림 발송 기능간 의존도 감소", null, true),
            new ProjectDetail("Github Repository", "https://github.com/infomuscle", true)
        ));
        project2.getSkills().addAll(Arrays.asList(
            new ProjectSkill(project2, python),
            new ProjectSkill(project2, django),
            new ProjectSkill(project2, kafka)
        ));

        projectRepository.saveAll(Arrays.asList(project1, project2));

        Account account = new Account("admin1", "$2a$10$BWi6SLqZRJyVvJyufjTtHeYXNNhpNY9rxaVl9fBOE.1t3QF98B.cO");
        accountRepository.save(account);
    }
}
