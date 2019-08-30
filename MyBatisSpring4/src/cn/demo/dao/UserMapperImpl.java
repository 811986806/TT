/*package cn.demo.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import cn.demo.entity.User;
@Repository("userMapper")
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
	@Resource
	private SqlSessionTemplate sqlSession;

	@Override
	public List<User> getUserList() {
		return sqlSession
		.selectList("cn.demo.dao.UserMapper.getUserList");
	}

}
*/