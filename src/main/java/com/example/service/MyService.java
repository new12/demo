package com.example.service;

import com.example.condition.JdbcTemplateCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * Created by longkeyu on 2017/1/1.
 */
@Conditional(JdbcTemplateCondition.class)
@Component
public class MyService {
}
