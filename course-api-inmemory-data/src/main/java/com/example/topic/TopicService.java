package com.example.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository repository;
	
	/*private List<Topic> topics = new ArrayList<>((Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring description"),
			new Topic("Java", "Core Java", "Java Description"),
			new Topic("JavaScript", "Java Script", "JS Description"))));*/
	
	public List<Topic> getAllTopics(){
		List<Topic> topics = new ArrayList<>();
		repository.findAll().forEach(t->topics.add(t));
		return topics;
	}
	
	public Topic getTopicById(String id){
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return repository.findById(id).get();
	}
	
	public void addTopic(Topic topic){
		repository.save(topic);
	}
	
	public void updateTopic(Topic topic){
		repository.save(topic);
	}
	
	public void deleteTopic(String id){
		//topics.removeIf(t -> t.getId().equals(id));
		repository.deleteById(id);
	}

}
