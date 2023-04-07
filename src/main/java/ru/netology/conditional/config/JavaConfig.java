package ru.netology.conditional.config;

import ru.netology.conditional.profileService.DevProfile;
import ru.netology.conditional.profileService.ProductionProfile;
import ru.netology.conditional.profileService.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(value = "netology.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    @ConditionalOnProperty(value = "netology.profile.prod", havingValue = "true")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
