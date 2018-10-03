package com.bobocode.config;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

/**
 * This class provides spring configuration for {@link javax.persistence.EntityManagerFactory} bean.
 * <p>
 * todo: 1. PLEASE NOTE, THAT SOME REQUIRED STEPS ARE OMITTED IN THE TODO LIST AND YOU HAVE TO DO IT ON YOUR OWN
 * <p>
 * todo: 2. Configure {@link DataSource} bean
 * todo: 3. Configure {@link JpaVendorAdapter} bean
 * todo: 3. Configure {@link javax.persistence.EntityManagerFactory} bean with name "entityManagerFactory"
 * todo: 4. Enable JPA repository, set appropriate package using annotation property "basePackages"
 */
public class JpaConfig {

    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .build();
    }

    public JpaVendorAdapter jpaVendorAdapter() {
        // todo: create HibernateJpaVendorAdapter
        // todo: set H2 database
        // todo: enable DDL generation
        throw new UnsupportedOperationException("Application won't start until you provide configs");
    }

    public LocalContainerEntityManagerFactoryBean localContainerEMF() {
        // todo: create and configure required bean
        // todo: set package "com.bobocode.model" to scan for JPA entities
        throw new UnsupportedOperationException("Application won't start until you provide configs");
    }
}
