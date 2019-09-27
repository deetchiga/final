package Example.Config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
@Configuration
@ComponentScan

public class mammoConfig {


    @Bean(name = "project1")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource userDbMaria() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "mariaJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("project1") DataSource project1) {
        return new JdbcTemplate(project1);
    }
}
