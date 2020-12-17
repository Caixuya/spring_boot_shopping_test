package com.thxy.shopping.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class YourCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
// TODO Auto-generated method stub
		return !context.getResourceLoader().getResource("classpath:test.properties").exists();
	}
}
