package com.spring.jpa.customrepository.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void crud() {
        postRepository.findMyPost();
    }
    @Test
    public void crud2() {
        postRepository.findAll();
    }

    @Test
    public void crud3() {
        // Jpa Transaction
        Post post = new Post();
        post.setTitle("hibernate");
        postRepository.save(post);
        postRepository.delete(post);
        postRepository.flush();
    }
}