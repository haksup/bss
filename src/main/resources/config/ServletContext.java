package config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.suby.bss")
public class ServletContext extends WebMvcConfigurerAdapter {
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/home").setViewName("home");
//		registry.addViewController("/").setViewName("home");
//		registry.addViewController("/hello").setViewName("hello");
//		registry.addViewController("/login").setViewName("login");
//		registry.addViewController("/403").setViewName("403");
//	}
	
	// equivalents for <mvc:resources/> tags
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/css/**").addResourceLocations("/css/").setCachePeriod(31556926);
        registry.addResourceHandler("/images/**").addResourceLocations("/img/").setCachePeriod(31556926);
    	registry.addResourceHandler("/app/**").addResourceLocations("/app/").setCachePeriod(31556926);
        registry.addResourceHandler("/js/**").addResourceLocations("/js/").setCachePeriod(31556926);
        registry.addResourceHandler("/node_modules/**").addResourceLocations("/node_modules/").setCachePeriod(31556926);
    }

//    //@Value("${datasource.driver-class-name}")
//    private String driverClassName = "com.mysql.jdbc.Driver";
//    //@Value("${datasource.url}")
//    private String url = "jdbc:mysql://bss.csptpfgc3po4.ap-northeast-2.rds.amazonaws.com:3306/bss?useUnicode=true&characterEncoding=utf8&rewriteBatchedStatements=true&autoReconnect=true";
//    //@Value("${datasource.username}")
//    private String username = "admin";
//    //@Value("${datasource.password}")
//    private String password = "admin123";
//    
//    @Bean
//    public DataSource dataSource(){
//    	BasicDataSource dataSource = new BasicDataSource();
//    	dataSource.setDriverClassName(driverClassName);
//    	dataSource.setUrl(url);
//    	dataSource.setUsername(username);
//    	dataSource.setPassword(password);
//    	return dataSource;
//    }
    
//    @Bean
//    public LocalSessionFactoryBean sessionFactory(){
//    	final LocalSessionFactoryBean sessionFactory = new LocalSessionFactortBean();
//    	sessionFactory.setDataSource(dataSource());
//    	sessionFactory.setPackagesToScan(new String[]{"net.suby.bss.*"});
//    	sessionFactory.setHibernateProperties(hibernateProperties());
//    	
//    	return sessionFactory;
//    }
    
    
	
}
