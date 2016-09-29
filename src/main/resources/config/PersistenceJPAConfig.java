package config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PersistenceJPAConfig {

	//@Value("${datasource.driver-class-name}")
    private String driverClassName = "com.mysql.jdbc.Driver";
    //@Value("${datasource.url}")
    private String url = "jdbc:mysql://bss.csptpfgc3po4.ap-northeast-2.rds.amazonaws.com:3306/bss"; // ?useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true&autoReconnect=true";
    //@Value("${datasource.username}")
    private String username = "admin";
    //@Value("${datasource.password}")
    private String password = "admin123";
    
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
       LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
       em.setDataSource(dataSource());
       em.setPackagesToScan(new String[] {"net.suby.bss.*" });
  
       JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
       em.setJpaVendorAdapter(vendorAdapter);
       em.setJpaProperties(additionalProperties());
  
       return em;
    }
  
    @Bean
    public DataSource dataSource(){
    	BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setDriverClassName(driverClassName);
    	dataSource.setUrl(url);
    	dataSource.setUsername(username);
    	dataSource.setPassword(password);
    	return dataSource;
    }
  
    Properties additionalProperties() {
    	Properties properties = new Properties();
    	properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
    	return properties;
    }
    
//    @Bean
//  public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
//     JpaTransactionManager transactionManager = new JpaTransactionManager();
//     transactionManager.setEntityManagerFactory(emf);
//
//     return transactionManager;
//  }
//
//  @Bean
//  public PersistenceExceptionTranslationPostProcessor exceptionTranslation(){
//     return new PersistenceExceptionTranslationPostProcessor();
//  }
}
