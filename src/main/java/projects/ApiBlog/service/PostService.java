package projects.ApiBlog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projects.ApiBlog.repository.PostRepository;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
}
