package JdbcTemplateTest;

import com.example.configuration.SpringConfig;
import com.example.domain.Org;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import javax.sql.DataSource;
import java.util.List;

/**
 * @author ：qinjinwei
 * @date ：Created in 2022/4/15 21:34
 * @description：
 * @modified By：
 * @version: $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfig.class})
public class test {
    @Qualifier("jdbcTemplateBean")
    @Autowired
    private JdbcTemplate  jdbcTemplate;
    @Test
    public void test1(){
        ApplicationContext applicationContex = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource dataSource = (DataSource) applicationContex.getBean("dataSource01");
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        int row = jdbcTemplate.update("insert into org values(?,?,?,?)","1","1","1","1");
        System.out.println(row);
    }

    @Test
    public void test2(){
        ApplicationContext applicationContex = new ClassPathXmlApplicationContext("applicationConfig.xml");
        JdbcTemplate jdbcTemplate = applicationContex.getBean(JdbcTemplate.class);
        int row = jdbcTemplate.update("insert into org values(?,?,?,?)","2","2","2","2");
        System.out.println(row);
    }
    @Test
    public void test3(){
//        ApplicationContext applicationContex = new AnnotationConfigApplicationContext(SpringConfig.class);
//        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContex.getBean("jdbcTemplateBean");
        int row = jdbcTemplate.update("insert into org values(?,?,?,?)","6","6","6","6");
        System.out.println(row);
    }


    public void queryAll(){
//        ApplicationContext applicationContex = new AnnotationConfigApplicationContext(SpringConfig.class);
//        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContex.getBean("jdbcTemplateBean");
        List<Org> orgList= jdbcTemplate.query("select * from org",new BeanPropertyRowMapper<Org>(Org.class));
        System.out.println(orgList);
    }
    @Test
    public void queryOne(){
//        ApplicationContext applicationContex = new AnnotationConfigApplicationContext(SpringConfig.class);
//        JdbcTemplate jdbcTemplate = (JdbcTemplate) applicationContex.getBean("jdbcTemplateBean");
          Org org= (Org) jdbcTemplate.queryForObject("select * from org where FD_ORG_ID = ?",new BeanPropertyRowMapper<Org>(Org.class),"4");
        System.out.println(org);
    }

}
