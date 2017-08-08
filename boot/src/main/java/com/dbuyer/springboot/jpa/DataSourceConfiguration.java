package com.dbuyer.springboot.jpa;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;

/**
 * 说明: 多数据源测试<br/>
 * 注意事项：多数据源配置时，其中一个数据源必须加上@Primary注解
 * 
 * @author 况小锋
 * @version 1.0
 */
@Configuration
public class DataSourceConfiguration {

	@Bean(name = "reportDataSource")
	@ConfigurationProperties("app.datasource.report")
	public DataSource reportDataSource() {
		return DataSourceBuilder.create().type(HikariDataSource.class).build();
	}

	@Bean(name = "orderDataSource")
	@Primary
	@ConfigurationProperties("app.datasource.order")
	public DataSource orderDataSource() {
		return DataSourceBuilder.create().type(HikariDataSource.class).build();
	}

}
