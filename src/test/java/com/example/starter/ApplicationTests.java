package com.example.starter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Test
    public void autoconfiguratieWordtGenegeerd() {
        ApplicationContextRunner contextRunner = new ApplicationContextRunner()
                .withConfiguration(AutoConfigurations.of(WelcomerAutoConfiguration.class));

        contextRunner.withUserConfiguration(WelcomerConfiguration.class)
                .run(context -> {
                    assertThat(context).hasSingleBean(Welcomer.class);
                    assertThat(context.getBean(Welcomer.class)).isSameAs(
                            context.getBean(WelcomerConfiguration.class).myWelcomer());
                });
    }

    @Configuration
    static class WelcomerConfiguration {

        @Bean
        public Welcomer myWelcomer() {
            return new Welcomer(null);
        }
    }
}
