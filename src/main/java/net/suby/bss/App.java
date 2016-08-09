package net.suby.bss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext appContext = SpringApplication.run(App.class, args);

    	Resource resource = 
           appContext.getResource("classpath:test.txt");
    	
    try{
     	  InputStream is = resource.getInputStream();
          BufferedReader br = new BufferedReader(new InputStreamReader(is));
        	
          String line;
          while ((line = br.readLine()) != null) {
             System.out.println(line);
       	  } 
          br.close();
        	
    	}catch(IOException e){
    		e.printStackTrace();
    	}
    	
    }
}