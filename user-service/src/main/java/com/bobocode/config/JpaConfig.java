package com.bobocode.config;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaVendorAdapter;

import javax.sql.DataSource;

/**
 * This class provides spring configuration for {@link javax.persistence.EntityManagerFactory} bean.
 * <p>
 * todo: 0. PLEASE NOTE, THAT SOME REQUIRED STEPS ARE OMITTED IN THE TODO LIST AND YOU HAVE TO DO IT ON YOUR OWN
 * <p>
 * todo: 1. Configure {@link DataSource} bean
 * todo: 2. Configure {@link JpaVendorAdapter} bean
 * todo: 3. Configure {@link javax.persistence.EntityManagerFactory} bean with name "entityManagerFactory"
 * todo: 4. Enable JPA repository
 */
public class JpaConfig {

    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .build();
    }
}
