/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.affinity.jmspoc;

import javax.jms.JMSConnectionFactoryDefinition;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;

/**
 *
 * @author Najeeb
 */
@JMSDestinationDefinitions({

@JMSDestinationDefinition(
        name = Resources.REQUEST_QUEUE,
        interfaceName = "javax.jms.Queue",
        destinationName = "jms.servletQueue"),
@JMSDestinationDefinition(
        name = Resources.REQUEST_TOPIC,
        interfaceName = "javax.jms.Topic",
        destinationName = "jms.servletTopic")
})

@JMSConnectionFactoryDefinition(
        name = Resources.CONNECTION_FACTORY,
        clientId = "jmsServlet"
)
public class Resources {

//    public static final String REQUEST_QUEUE = "java:global/weblogic/examples/jms/servletQueue";
//    public static final String CONNECTION_FACTORY = "java:global/weblogic/examples/jms/servletXAConnectionFactory";
//
//    public static final String REQUEST_TOPIC = "java:global/weblogic/examples/jms/servletTopic";
    public static final String REQUEST_QUEUE = "java:app/weblogic/examples/jms/servletQueue";
    public static final String CONNECTION_FACTORY = "java:app/weblogic/examples/jms/servletXAConnectionFactory";

    public static final String REQUEST_TOPIC = "java:app/weblogic/examples/jms/servletTopic";

}
