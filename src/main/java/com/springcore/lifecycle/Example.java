package com.springcore.lifecycle;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Example {
	private String Sub;
	
	@PostConstruct
	public void init() {
		System.out.println("hi vikas");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("hi vik destroy");
	}
}
