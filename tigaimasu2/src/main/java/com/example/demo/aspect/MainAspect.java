package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import jakarta.servlet.http.HttpServletRequest;

@Aspect
@Component
public class MainAspect {

	@Before("execution(* com.example.demo.controller.*.*(..))")
	public void beforeMethod(JoinPoint joinPoint) {
		// コントローラーメソッドの前に実行する共通処理
		//System.out.println(session.getAttribute("userId"));
		HttpServletRequest req = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

		System.out.println(req.getSession().getAttribute("userId"));
		if (req.getSession().getAttribute("userId") == null) {
			System.out.println("ぬるだよ");
		} else {
			System.out.println("ヌルじゃないよ");
		}
	}

	@After("execution(* com.example.demo.controller.*.*(..))")
	public void afterMethod(JoinPoint joinPoint) {
		// コントローラーメソッドの後に実行する共通処理
		//System.out.println(session.getAttribute("userId"));
	}
}
