/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affinity.jmspoc;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Startup;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Najeeb
 */
@ApplicationScoped
@Startup
public class RepoClass {
    private List<String> msgs;
    
    @PostConstruct
    public void init(){
        msgs = new ArrayList<>();
    }
    
    @PreDestroy
    public void cleanup(){
        msgs = null;
    }
    
    public List<String> getMessage(){
        return msgs;
    }
    
    public void addMessage(String msg){
        msgs.add(msg);
    }
}
