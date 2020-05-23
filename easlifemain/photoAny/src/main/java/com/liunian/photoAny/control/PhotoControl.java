package com.liunian.photoAny.control;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PhotoControl {
	@Value("${name}")
	String foo;

	@Value("${id}")
	String bar;

	@RequestMapping(value = "/foo")
	public String foo() {
		return foo + "——" + bar;
	}
}
