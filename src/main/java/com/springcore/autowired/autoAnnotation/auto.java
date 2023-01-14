package com.springcore.autowired.autoAnnotation;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;


@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@ToString
public class auto {
	@Autowired
	private wire wire;
}
