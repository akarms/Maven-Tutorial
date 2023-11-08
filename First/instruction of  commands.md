# commands in maven

## maven has 4 main commands 
### 1. mvn clean
### 2. mvn test
### 3. mvn compile
### 4. mvn buid

---
<br>

## mvn clean
### this command is used to clean the target folder
### It will erase all dependency files from folder
like class fies of java and test files of java

## there are some artifacts which are created by maven
1. jar - java archive 
2. war - web archive
 ---
<br>

## mvn test
### this command is used to test the project
### it will run all the test cases in the project

 ---
<br>

## mvn compile
### this command is used to compile the project
### it will compile all the java files in the project

 ---
<br>

## mvn build
### this command is used to build the project
### it will build the project and create the jar file of the project

 ---
<br>

## mvn package
### this command is used to package the project
### it will package the project and create the jar file of the project

 ---
<br>

## jar file
### jar file is the java archive file
### it is used to store the java class files and resources
### when it's created name of the artifact directory and version of the artifact is used


## afer all packages created we can run the project using the command

java -cp target/hello-world-1.0-SNAPSHOT.jar com.mycompany.app.App

this is the code i have used to tun
here we code "java -cp target/" (name_of_the_jar_file).jar  (group_id).app " 
