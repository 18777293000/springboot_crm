package com.yangming.crm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );
        ConfigurableApplicationContext run = SpringApplication.run(App.class, args);
    }
}
