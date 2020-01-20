package com.flightmanagement.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@PropertySource("classpath:application.properties")
//@Configuration("dbConfiguration")
public class DbConfiguration {
private static Logger logger = LogManager.getLogger(DbConfiguration.class.getName());
	
	private JdbcTemplate jdbcTemplate;
    @Value("${jdbc.driverclassname}")
    private String driverClassName;
	@Value("jdbc.url")
	private String url;
	@Value("${}jdbc.user")
	private String username;
	@Value("jdbc.password")
	private String password;
	
//	@Bean("jdbcTemplate")
//	public JdbcTemplate getDataSource() {
//		try {
//			DriverManagerDataSource dataSource = new DriverManagerDataSource();
//			dataSource.setDriverClassName(driverClassName);
//			dataSource.setUrl(url);
//			dataSource.setUsername(username);
//			dataSource.setPassword(password);
//			jdbcTemplate = new JdbcTemplate(dataSource);
//		}catch (Exception e) {
//			// TODO: handle exception
//			logger.error("Error is getting data source ready",e);
//		}
//		return jdbcTemplate;
//		
//	}
	@Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }
	
	
	
	
}
