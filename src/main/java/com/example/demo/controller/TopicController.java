/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Topic;
import com.example.demo.service.TopicService;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Krzysiek
 */
@RestController
public class TopicController {
          
    @Autowired
    private TopicService topicService; 
    
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){       
        return topicService.getAllTopicsList();
    }
    
    @RequestMapping("/topics/{id}")
    public Topic getOneTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }
        
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
    
    @RequestMapping(method = RequestMethod.PUT, value = "/topics")
    public void changeTopic(@RequestBody Topic topic){
        topicService.changeTopic(topic);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void changeTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
