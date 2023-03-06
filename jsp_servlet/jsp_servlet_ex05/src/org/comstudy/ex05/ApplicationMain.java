package org.comstudy.ex05;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ApplicationMain {

   public static void main(String[] args) throws IOException {

      String resource = "org/comstudy/ex05/mybatis-config.xml";
      InputStream inputStream = Resources.getResourceAsStream(resource);
      SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
      
      try (SqlSession session = sqlSessionFactory.openSession()) {
    	  SaramDTO saram = session.selectOne("org.comstudy.ex05.SaramMapper.selectBlog", 101);
    	}
   }
}