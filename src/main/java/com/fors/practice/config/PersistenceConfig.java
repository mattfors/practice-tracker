package com.fors.practice.config;

import java.util.Properties;
import javax.sql.DataSource;
import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@ComponentScan({ "org.baeldung.spring.persistence" })
public class PersistenceConfig {
	 	 
	   @Bean
	   public AnnotationSessionFactoryBean sessionFactory() {
	      AnnotationSessionFactoryBean sessionFactory = new AnnotationSessionFactoryBean();
	      sessionFactory.setDataSource(restDataSource());
	      sessionFactory.setPackagesToScan(new String[] { "com.fors.practicel" });
	      sessionFactory.setHibernateProperties(hibernateProperties());
	 
	      return sessionFactory;
	   }
	 
	   @Bean
	   public DataSource restDataSource() {
	      BasicDataSource dataSource = new BasicDataSource();
	      dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	      dataSource.setUrl("jdbc:mysql://localhost:3306/practrac");
	      dataSource.setUsername(("flyway"));
	      dataSource.setPassword(("flyway"));	 
	      return dataSource;
	   }
	 
	   @Bean
	   @Autowired
	   public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
	      HibernateTransactionManager txManager = new HibernateTransactionManager();
	      txManager.setSessionFactory(sessionFactory);
	 
	      return txManager;
	   }
	 
	   @Bean
	   public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
	      return new PersistenceExceptionTranslationPostProcessor();
	   }
	 
	   Properties hibernateProperties() {
	      return new Properties() {
			private static final long serialVersionUID = 1L;

			{
	            setProperty("hibernate.hbm2ddl.auto", "create-drop");
	            setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	         }
	      };
	   }
	}