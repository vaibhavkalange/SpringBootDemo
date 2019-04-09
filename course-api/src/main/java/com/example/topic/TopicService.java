package com.example.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>((Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring description"),
			new Topic("Java", "Core Java", "Java Description"),
			new Topic("JavaScript", "Java Script", "JS Description"))));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopicById(String id){
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addTopic(Topic topic){
		topics.add(topic);
	}
	
	public void updateTopic(String id, Topic topic){
		int count=0;
		for(Topic top : topics){
			if(top.getId().equals(id)){
				topics.set(count, topic);
				return;
			}
			count++;
		}
	}
	
	public void deleteTopic(String id){
		topics.removeIf(t -> t.getId().equals(id));
	}

}
