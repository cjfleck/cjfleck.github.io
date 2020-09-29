package com.caseyjofleck.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@PropertySource("classpath:jdbc.properties") // Annotation to enable access to the jdbc.properties file
@EnableJpaRepositories(basePackages = {"com.caseyjofleck.persistence"}, entityManagerFactoryRef="entityManagerFactory")
public class SpringRepositoryConfig {

	// Inject the Environment
	@Autowired
	private Environment env; 
	
	   @Bean
	   public static PropertySourcesPlaceholderConfigurer
	     propertySourcesPlaceholderConfigurer() {
	      return new PropertySourcesPlaceholderConfigurer();
	   }

	@Bean DataSource caseyjofleckDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		 try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			ds.setUrl(env.getProperty("caseyjofleck.url"));  
			ds.setDriverClassName(env.getProperty("caseyjofleck.driverClassName"));
			ds.setUsername(env.getProperty("caseyjofleck.dbUserName"));
			ds.setPassword(env.getProperty("caseyjofleck.password"));
		 } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ds;
	}

	@Bean
	public JpaVendorAdapter vendorAdapter() {
		HibernateJpaVendorAdapter va = new HibernateJpaVendorAdapter();
		va.setShowSql(true);
		va.setGenerateDdl(false);
		return va;
	}
	
	@Bean(name="entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean caseyjofleckEmf() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();

		// Get the "persistenceUnitName" property and add it to the EM
		em.setPersistenceUnitName(env.getProperty("caseyjofleck.persistenceUnitName")); 

		em.setDataSource(caseyjofleckDataSource());
		em.setPackagesToScan("com.caseyjofleck.*");
		em.setJpaVendorAdapter(vendorAdapter());
		em.setJpaProperties(additionalProperties());
		return em;
	}

	@Bean
	public PlatformTransactionManager transactionManager(){
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(caseyjofleckEmf().getObject());
		return transactionManager;
	} 	
	
	private Properties additionalProperties() {
	      Properties properties = new Properties();
	      properties.setProperty("hibernate.dialect", env.getProperty("caseyjofleck.dialect")); // I would have the student edit this in the properties file
	      return properties;
	   }


}