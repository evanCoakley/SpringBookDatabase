package org.workingdepot.springbookdatabase.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails evan = User.builder()
                .username("EvanC")
                .password("{noop}test84")
                .roles("MANAGER", "ADMIN")
                .build();

        UserDetails rebekah = User.builder()
                .username("Beckeroo")
                .password("{noop}test77")
                .roles("MANAGER", "ADMIN")
                .build();

        UserDetails logan = User.builder()
                .username("Logibear")
                .password("{noop}test19")
                .roles("EMPLOYEE")
                .build();

        UserDetails lola = User.builder()
                .username("Lolamuffin")
                .password("{noop}test20")
                .roles("EMPLOYEE")
                .build();

        return new InMemoryUserDetailsManager(evan, rebekah, logan, lola);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
                        configurer.anyRequest().authenticated()
                )
                .formLogin(form -> form
                        .loginPage("/showLoginPage")
                        .loginProcessingUrl("/authenticateTheUser")
                        .permitAll()
                );
        return http.build();

    }


}
