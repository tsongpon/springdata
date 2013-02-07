package tum.test.dao;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {
                "classpath:/spring-application-context.xml"})
public class CommentRepositoryTest {

    @Autowired
    private CommentRepository commentRepository;

    @org.junit.Test
    public void testPostCreate() throws Exception {

//        for(int i = 1;i<10000;i++) {
//            Comment comment = new Comment();
//            comment.setUserName("tum");
//            comment.setCreatedTime(new Date());
//            comment.setContents("test");
//            commentRepository.save(comment);
//        }
        System.out.println(commentRepository.count());

    }
}
