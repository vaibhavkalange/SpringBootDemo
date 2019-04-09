package com.example.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository repository;
	
	/*private List<Topic> topics = new ArrayList<>((Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring description"),
			new Topic("Java", "Core Java", "Java Description"),
			new Topic("JavaScript", "Java Script", "JS Description"))));*/
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses = new ArrayList<>();
		repository.findByTopicId(topicId).forEach(c->courses.add(c));
		return courses;
	}
	
	public Course getCourseById(String id){
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return repository.findById(id).get();
	}
	
	public void addCourse(Course course){
		repository.save(course);
	}
	
	public void updateCourse(Course course){
		repository.save(course);
	}
	
	public void deleteCourse(String id){
		//topics.removeIf(t -> t.getId().equals(id));
		repository.deleteById(id);
	}

}
