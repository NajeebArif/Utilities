# jms-2.0-poc
This application an poc for JMS-2.0 which uses annotations to define and use JMS modules.

This example demonstrates the following key features:

@JMSDestinationDefinitions
@JMSDestinationDefinition      // and how to create both Queue and Topics and
@JMSConnectionFactoryDefinition
@JMSConnectionFactory

The application is packaged as a simple war and was tested on Welogic 12.2.1.

This application can also be treated as an example for using CDI in a war (beans.xml in WEB-INF)
