# Latihan Java Dasar #

## Apache Maven ##

membuat project baru
```
mvn archetype: generate -DgroupId=nama.package -DartifactId=nama-project -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

menambahkan dependency
```
	<dependency>
	  <groupId>junit</groupId>
	  <artifactId>junit</artifactId>
	  <version>4.9</version>
	  <scope>test</scope>
	</dependency>
```

compile nya 
```
mvn clean install
```

run nya 
```
mvn exec:java -Dexec.mainClass=nama.package.App
```	
## Spring-boot ##