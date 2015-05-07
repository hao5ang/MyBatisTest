package com.gmail.waohao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.gmail.waohao.mapper.DemoMapper;
import com.gmail.waohao.model.Demo;
import com.gmail.waohao.model.DemoExample;
import com.gmail.waohao.model.DemoKey;

public class MyBatisTest {
	public static void main(String[] args) throws Exception {
		String resource = "com/gmail/waohao/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();

		try {
			DemoMapper mapper = session.getMapper(DemoMapper.class);
			DemoKey key = new DemoKey();
			key.setId(1L);
			key.setType((short) 1);
			List<Demo> d = mapper.selectByPrimaryKey(key);
			System.out.println(d.get(0).getRemark());
			System.out.println(d.get(1).getRemark());
			
			key.setType(null);
			DemoExample example = new DemoExample();
			DemoExample.Criteria criteria = example.createCriteria();
			criteria.andIdEqualTo(1L);
			d = mapper.selectByExample(example);
			System.out.println(d.size());
		} finally {
			session.close();
		}
	}
}
