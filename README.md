# spring-boot-h2-database-example
Simple web application demonstrating a currency controller, build on top of [this project.](https://www.javatpoint.com/spring-boot-h2-database)

Notable additions:

`src/main/java/com.javatpoint.model.Currency`: 
Currency model with relevant attribute fields

`src/main/java/com.javatpoint.controller.CurrencyController`: 
Application controller for manipulating currencies, defines http endpoints

`src/main/java/com.javatpoint.service.CurrencyService`:  
Service which handles operations on the currency table

---

Run the application by running `.\mvnw spring-boot:run` in the project directory.
Once running, [localhost/8090/h2-console](http://localhost:8090/h2-console) offers a dive into the in-memory database of the application.
After entering username `sa` and an empty password, you will be able to see the entries in the currency table. It should be initially seeded with 4 entries.

