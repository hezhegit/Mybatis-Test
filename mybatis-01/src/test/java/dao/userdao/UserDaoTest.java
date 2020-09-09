package dao.userdao;

import dao.pojo.User;
import dao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){

        //第一步获得sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行SQL
        //方式一：getMapper
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();
        System.out.println(userList);

        //方式二：
        //List<User> users = sqlSession.selectList("dao.userdao.getUserList");//我们要返回一个List

        //关闭sqlSession
        sqlSession.close();
    }
}
