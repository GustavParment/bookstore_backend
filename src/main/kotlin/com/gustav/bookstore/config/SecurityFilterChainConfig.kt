package com.gustav.bookstore.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer.AuthorizationManagerRequestMatcherRegistry
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityFilterChainConfig {

    @Bean
    fun securityFilterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeHttpRequests {
                authorizeRequest -> authorizeRequest
                .requestMatchers("/*")
                .permitAll()

            }
        return http.build()
    }

    }
