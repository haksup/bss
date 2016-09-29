package config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class PersistenceMybatisConfig {

	//@Value("${datasource.driver-class-name}")
    private String driverClassName = "com.mysql.jdbc.Driver";
    //@Value("${datasource.url}")
    private String url = "jdbc:mysql://bss.csptpfgc3po4.ap-northeast-2.rds.amazonaws.com:3306/bss"; // ?useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true&autoReconnect=true";
    //@Value("${datasource.username}")
    private String username = "admin";
    //@Value("${datasource.password}")
    private String password = "admin123";
    
    @Bean
    public DataSource dataSource(){
    	BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setDriverClassName(driverClassName);
    	dataSource.setUrl(url);
    	dataSource.setUsername(username);
    	dataSource.setPassword(password);
    	return dataSource;
    }
    
    @Bean
    public DataSourceTransactionManager transactionManager()
    {
        return new DataSourceTransactionManager(dataSource());
    }
     
    @Bean(name="sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
                
        // 이 부분은 mybatis mapper 위치에 대해서 설정해주는 부분...
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/**/*.xml"));
        return sessionFactory;
    }
    
    @Bean
    public MapperScannerConfigurer MapperScannerConfigurer() {
    	MapperScannerConfigurer configurer = new MapperScannerConfigurer();
    	configurer.setBasePackage("net.suby.bss.**.dao");
    	configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
    	return configurer;
    }
}
