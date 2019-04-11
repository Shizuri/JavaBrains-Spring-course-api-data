package io.javabrains.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String foo);
//    public List<Course> findByName(String name); // spring boot will create this implementation by using magic and witchcraft
}

// getAllTopics()
// getTopic(String id)
// updateTopic(Course t)
// deleteTopic(String id)

// instead of doing all of this just make an interface