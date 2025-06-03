package com.jaeyoon.blog.presentation.interceptor;

import com.jaeyoon.blog.domain.entity.HttpInterface;
import com.jaeyoon.blog.domain.repository.HttpInterfaceRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class PresentationInterceptor implements HandlerInterceptor {

    private final HttpInterfaceRepository httpInterfaceRepository;

    public PresentationInterceptor(HttpInterfaceRepository httpInterfaceRepository) {
        this.httpInterfaceRepository = httpInterfaceRepository;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        HttpInterface httpInterface = new HttpInterface(request);
        httpInterfaceRepository.save(httpInterface);
    }
}
