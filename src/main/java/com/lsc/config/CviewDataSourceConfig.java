package com.lsc.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = {"com.lsc.cview.repository"}, entityManagerFactoryRef = "cviewEntityManagerFactory", transactionManagerRef = "cviewTransactionManager")
public class CviewDataSourceConfig {

    @Primary
    @Bean(name = "cviewDataSource")
    @ConfigurationProperties(prefix = "spring.cview-datasource")
    public DataSource cviewDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "cviewEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean cviewEntityManagerFactoryBean(@Qualifier("cviewDataSource") DataSource cviewDataSource) {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(cviewDataSource);
        JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();

        em.setJpaVendorAdapter(vendorAdapter);
        em.setPackagesToScan(new String[]{"com.lsc.cview.entity"});
        em.setPersistenceUnitName("cview");
        return em;
    }

    @Primary
    @Bean(name = "cviewTransactionManager")
    public JpaTransactionManager  cviewTransactionManager(@Qualifier("cviewEntityManagerFactory") EntityManagerFactory
            entityManagerFactory) {
        JpaTransactionManager tm = new JpaTransactionManager(entityManagerFactory);
        return tm;
    }

}
