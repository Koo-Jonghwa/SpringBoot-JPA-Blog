package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//스프링이 com.cos.bolg 패키지 이하를 스캔해서 모든 파일을 메모리에 new하는 것은 아니구요
//특정 어노테이션이 붙어있는 클래스 파일들을 new해서(IoC) 스프링 컨테이너에 관리해 줍니다

@RestController
public class BlogControllerTest {
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1>hello spring boot</h1>";
	}
	//http://localhost:8080/test/hello1
	@GetMapping("/test/hello1")
	public String hello1() {
		return "<h2>spring boot test</h2>";
	}
}
