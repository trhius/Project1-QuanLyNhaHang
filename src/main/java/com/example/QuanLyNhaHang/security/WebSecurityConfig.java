package com.example.QuanLyNhaHang.security;

import com.example.QuanLyNhaHang.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;

import javax.sql.DataSource;
import java.util.Collections;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
//    @Autowired
//    UserDetailsService userDetailsService;

    @Bean
    public UserDetailsService userDetailsService() {
        return new CustomUserDetailsService();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());

        return authProvider;
    }

//    @Autowired
//    private CustomAuthenticationFailureHandler authenticationFailureHandler;
//    @Autowired
//    private CustomAuthenticationSuccessHandler authenticationSuccessHandler;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests().requestMatchers("/home").permitAll()
                .and()
                .formLogin()
                    .loginPage("/login")
                    .usernameParameter("userName")
                    .loginProcessingUrl("/login")
                    .defaultSuccessUrl("/welcome")
                    .permitAll()
                    .and()
                    .logout().logoutSuccessUrl("/home");

        return http.build();
    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//        http.authorizeRequests().requestMatchers("/").permitAll();
//        http.authorizeRequests()
//            .requestMatchers("/admin/**").hasAuthority("ADMIN")
//            .requestMatchers("/user/**").hasAuthority("USER")
//            .anyRequest().authenticated()
//            .and()
//        .formLogin()
//            .loginPage("/login")
//            .usernameParameter("username")
//            .successHandler(authenticationSuccessHandler)
//            .failureHandler(authenticationFailureHandler)
//            .permitAll()
//            .and()
//        .logout()
//            .permitAll()
//            .and()
//        .sessionManagement()
//            .maximumSessions(1)
//            .sessionRegistry(sessionRegistry())
//            .and()
//            .and()
//            .csrf().disable();
//
//        return http.build();
//    }

    @Bean
    public SessionRegistry sessionRegistry(){
        return new SessionRegistryImpl();
    }

    @Bean
    public HttpSessionSecurityContextRepository httpSessionSecurityContextRepository(){
        return new HttpSessionSecurityContextRepository();
    }

    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        return new ProviderManager(Collections.singletonList(authenticationProvider()));
    }

}
