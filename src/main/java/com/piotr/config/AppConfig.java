package com.piotr.config;

import com.piotr.dao.Database;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jalos on 05.04.2016.
 */

@ComponentScan(basePackages ="com.piotr" )
@Configuration
public class AppConfig {
    // zeby beans.xml nie bylo wystarczy dodac annotacje  , recznie trzeba byloby  zrobic metody , annotacje bean itd

    //@Bean
    //public Database database() {
        //return new Database(); // zeby wiedziec  ze tak sie definunuje beany. mmamy  w userDaoImpl  Repository oznaczajacej repository
        // wygodnie dac anotacje component i wtedy ok , i commponeng stan znajdzie nam tego beana,
        // ale moze  sie zdarzyc ze bedzemy  chcieli skorzystac z bana  z zewnetrznej bilbioteki wteduy  tworzy
        //my beana w te sposob jawnie.

     //   }


}
