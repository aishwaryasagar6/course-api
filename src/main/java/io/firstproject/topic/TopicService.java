package io.firstproject.topic;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	

	private List <Topic> A= new ArrayList<>(Arrays.asList(
			new Topic("java","core java","java descrption"),
					new Topic("spring","spring boot","spring descrption")
			));
	public List<Topic> getAllTopics(){
		return A;
		
	}
	public Topic getTopic(String id) {
		return A.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		A.add(topic);
		
	}
	public void updateTopic(String id, Topic topic) {
		for(int i=0;i<A.size();i++)
		{
			Topic t=A.get(i);
			if(t.getId().equals(id)) {
				A.set(i,topic);
				return ;
			}
		}
		
	}
	public void deleteTopic(String id) {
		A.removeIf(t-> t.getId().equals(id));
		
	}
	
}
