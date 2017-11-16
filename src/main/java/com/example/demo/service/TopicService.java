/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.service;

import com.example.demo.model.Topic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Krzysiek
 */
@Service
public class TopicService {
    
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("1","spring","spring description"),
                new Topic("2","java","java description"),
                new Topic("3","ejb","ejb description")));
    
    
    public List<Topic> getAllTopicsList(){
        return topics;
    }
    
    public Topic getTopic(String id){
        for(Topic t : topics){
            if(t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }
    
    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void changeTopic(Topic topic) {
        for(Topic t: topics){
            if(t.getId().equals(topic.getId())){
                t.setDescription(topic.getDescription());
                t.setName(topic.getName());
            }
        }
    }

    public void deleteTopic(String id) {
         for(Topic t : topics){
            if(t.getId().equals(id)){
                topics.remove(t);
            }
        }
    }
}
