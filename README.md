#### BigFramework - A Data Mapping Framework Generator (version 1.0)						          #

Please read the instructions before using this utility jar.

1. This API is compatible for JDK 1.8. It will not work with a prior version of JDK. 
2. Configure log home i.e. create a variable named LOG_HOME and put in the Java VM arguments of the class
   from which the API will be called. Log path will be LOG_HOME/logs.
3. You may configure the logging level of this API by configuring 'log4j.logger.api.bigframework'. The default
   logging level is 'INFO'. Also, please keep the 'log4j.properties' in src/main/resources/META-INF/properties directory.
4. Include this jar available with this API (bigframework-1.0.jar) as an external jar into workspace as it is not
   available in the Maven repository.
5. Configure dataMapping.properties and keep it in src/main/resources/META-INF/properties directory.
6. Please see the TriggeringPoint.java as an example of how to use the API. The details are described in that class.
   Please note to run the three requests separately. Also remember to refresh your workspaces after running a request,
   so that you can see the generated output.
7. In the mapping excel spreadsheet, only the green colored fields can be edited. Please don't change the values of
   any other field.
8. This API is compatible for a version of Cassandra where UDT is not supported. So, all the unbounded occurrence of
   elements/types in the schema definition is treated as a list of text in the entity class. The UDT support will be
   included in future releases of this API. 
