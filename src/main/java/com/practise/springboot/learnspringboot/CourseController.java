package com.practise.springboot.learnspringboot;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class CourseController {
@RequestMapping("/courses")
public List<Course> retrieveAllCourses(){
return Arrays.asList(
	new Course(1, "Learn AWS", "in28minutes"),
	new Course(2, "Learn devops", "in28minutes"),
	new Course(3, "Learn Azure", "in28minutes"),
	new Course(4, "Learn python", "in28minutes")
		);
}
}
