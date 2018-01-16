package com.buzheng.me.config;

import com.buzheng.me.mapper.AreaMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Created by buzheng on 18/1/15.
 */
@Configuration
@MapperScan("com.buzheng.me.mapper")
public class Config {

//    @Autowired
//    private DataSource dataSource;
//
//    @Bean(name = "sqlSessionFactory")
//    public SqlSessionFactory sqlSessionFactoryBean() {
//        SqlSessionFactoryBean sqlsession = new SqlSessionFactoryBean();
//        sqlsession.setDataSource(dataSource);
//        try {
//            //添加XML目录
//            ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//            sqlsession.setMapperLocations(resolver.getResources("mappers/*.xml"));
//            return sqlsession.getObject();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new RuntimeException(e);
//        }
//    }
//
//    @Bean
//    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
//        return new SqlSessionTemplate(sqlSessionFactory);
//    }
//

}
