package com.example.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/9 17:41
 * @description：
 * @modified By：
 * @version: $
 */
@Configuration
@ComponentScan("com.example")
@Import({DataSourceConfiguration.class}) //导入分的配置到总的核心配置
//<context:component-scan base-package="com.example"/>
public class SpringConfig {

    @Bean("jdbcTemplateBean")
    public JdbcTemplate getJdbcTemplate(@Qualifier("dataSource01")DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }

}
