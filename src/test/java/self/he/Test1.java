package self.he;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import self.he.mapper.GirlMapper;
import self.he.pojo.Girl;
import self.he.util.MybatisUtil;


import java.util.Date;

public class Test1 {
    @Test
    public  void ml(){
        SqlSession sqlSession = MybatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);
        Girl g = new Girl();
        g.setName("解决");
        g.setFlower("red");
        g.setBirthday(new Date());

        mapper.insert(g);
        sqlSession.commit();

        sqlSession.close();

    }
    @Test
    public  void m2(){
        SqlSession sqlSession = MybatisUtil.getSession();
        GirlMapper mapper = sqlSession.getMapper(GirlMapper.class);
        Girl girl = mapper.queryById(13L);
       System.out.print(girl.getName());

        sqlSession.commit();

        sqlSession.close();

    }
}
