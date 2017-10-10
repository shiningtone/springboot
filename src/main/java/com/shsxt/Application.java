package com.shsxt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by administer on 2017/10/10.
 */
    @SpringBootApplication
   public class Application{ //implements CommandLineRunner {

    private static Logger logger= LoggerFactory.getLogger(Application.class);
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
            }
   // @Override
   /* public void run(String... strings) throws Exception {
        logger.debug("springboot启动咯,{},{}","stone","king");

    }*/
}


