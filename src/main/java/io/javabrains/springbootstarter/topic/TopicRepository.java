package io.javabrains.springbootstarter.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {


}

// getAllTopics()
// getTopic(String id)
// updateTopic(Course t)
// deleteTopic(String id)

// instead of doing all of this just make an interface