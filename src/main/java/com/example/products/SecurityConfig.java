package com.example.products;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

/*    @Bean
    public UserDetailsService userDetailsService(){

        UserDetails user = User.withDefaultPasswordEncoder()
                .username("jakub1")
                .password("jakub1")
                .roles("user")
                .build();

        UserDetails admin = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .roles("admin")
                .build();

        UserDetails moderator = User.withDefaultPasswordEncoder()
                .username("moderator")
                .password("mod")
                .roles("moderator")
                .build();

        return new InMemoryUserDetailsManager(user, admin);
    }*/

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        http.authorizeRequests()
                // we need config just for console, nothing else
                .antMatchers("/console/**").permitAll();
        // this will ignore only h2-console csrf, spring security 4+
        http.csrf().ignoringAntMatchers("/console/**");
        //this will allow frames with same origin which is much more safe
        http.headers().frameOptions().sameOrigin();

        http.csrf().disable();

/*
        http.authorizeRequests()
                .anyRequest().permitAll()
                .antMatchers("/console").permitAll();
               // .antMatchers("/h2-console/**").permitAll()
                //.and().csrf().disable();
*/

                //.antMatchers(HttpMethod.GET, "/products").permitAll()
                //.antMatchers(HttpMethod.POST, "/products")hasAnyRole("moderator", "admin")
                //.antMatchers(HttpMethod.DELETE, "/products").hasRole("admin")
                //.anyRequest().permitAll().hasRole("admin");
                //.and().formLogin().permitAll()
                //.and().logout().permitAll()
                //.and().csrf().disable();

    }
}

