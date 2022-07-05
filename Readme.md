## Spring CRUD Application

Check Live Application here: https://amex-spring-crud-app.herokuapp.com/

### Steps to Run

1. Run `mvn clean install` on terminal / comand prompt
2. Run `mvn spring-boot:run` on terminal / comand prompt

### To Build and Run
```
mvn clean package spring-boot:repackage
java -jar target/spring-boot-ops.war
```

### API Docs

1. #### For fetching all the interns
    
    ```
    End point: https://amex-spring-crud-app.herokuapp.com/getInterns

    Method : GET
    ```

2. #### For adding a new intern

   ``` 
    End point: https://amex-spring-crud-app.herokuapp.com/addIntern

    Method : POST

    body: {
        "name": "your_name",
        "email": "your_email"
    }
    ```

3. #### For updating intern value

    ```
    End point: https://amex-spring-crud-app.herokuapp.com/updateIntern/{intern_id}

    Method : POST

    body: {
        "name": "your_name",
        "email": "your_email"
    }
    ```

4. #### For removing an intern

    ```
    End point: https://amex-spring-crud-app.herokuapp.com/deleteIntern/{intern_id}

    Method : POST
    ```

### Maven dependencies

```
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <scope>runtime</scope>
    <optional>true</optional>
</dependency>
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <optional>true</optional>
</dependency>
```
