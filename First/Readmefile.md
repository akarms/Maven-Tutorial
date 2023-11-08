# in here it i have created first maven project 

the code for creating a project is
 mvn archetype:generate -DgroupId=com.mycompany.app
-DartifactId=hello-world
-DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4

#actually you don't have to enter the full code here just entering the  mvn archetype:generate is enough
then it'll ask the groupId,artifactId,archetypeArtifactId,archetypeVersion

## groupId
actually groupId is the unique identifier for the project across all projects
groupId:com.mycompany.app

## artifactId
 artifactId is the name of the jar without version
artifactId:hello-world

## archetypeArtifactId
 archetypeArtifactId is the name of the maven archetype to use
archetypeArtifactId:maven-archetype-quickstart

## archetypeVersion
 archetypeVersion is the version of the archetype to use
archetypeVersion:1.4

 after entering the above details it'll ask for the version of the project
