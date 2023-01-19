maven-java-template
===================

This is the base for all standard standalone java based application.

How to use ?
=====================

1. Clone this repository.

2. Change the artifactId in your pom.xml with the project name.

3. Run mvn test, you should get "BUILD SUCCESS".

4. Import the project to your ide.

5. Add all your packages and source code to
    * src/main/java

6. Add the source code for test into
    * src/test/java

Goals
=========
1. Clean:
    * mvn clean

2. Build:
    * mvn compile
    * mvn test
    * mvn package
    * mvn install
    * mvn exec:java -Dexec.mainClass="com.example.Class"

### Plugins
* Junit5
* AssertJ
* Mockito