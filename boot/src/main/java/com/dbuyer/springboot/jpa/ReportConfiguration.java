package com.dbuyer.springboot.jpa;

import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * 说明: 多数据源测试<br/>
 * 注意事项：多数据源配置时，其中一个数据源必须加上@Primary注解<br/>
 * 多数据源引用配置必须通过@Qualifier注解指定关联的配置
 * 
 * @author 况小锋
 * @version 1.0
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.dbuyer.springboot.jpa.report", transactionManagerRef = "reportTransactionManagerPrimary", entityManagerFactoryRef = "reportEntityManagerFactory")
public class ReportConfiguration {

	@Autowired
	private JpaProperties jpaProperties;

	@Autowired
	@Qualifier("reportDataSource")
	private DataSource orderDataSource;

	@Bean(name = "reportEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean reportEntityManagerFactory(EntityManagerFactoryBuilder builder) {
		return builder.dataSource(orderDataSource)//
				.properties(getVendorProperties(orderDataSource))//
				.packages("com.dbuyer.springboot.jpa.report")//
				.persistenceUnit("report")//
				.build();
	}

	@Bean(name = "reportTransactionManagerPrimary")
	public PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
		return new JpaTransactionManager(reportEntityManagerFactory(builder).getObject());
	}

	private Map<String, String> getVendorProperties(DataSource dataSource) {
		return jpaProperties.getHibernateProperties(dataSource);
	}

}
