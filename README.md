# exception-handling
Exception Handling with Spring Boot

@RestControllerAdvice annotation provides to catch exception globally.

**Search and not found the name -> throw EntityNotFoundException** 

http://localhost:8080/car?name=test

**Start with 1 -> throw IllegalArgumentException** 

http://localhost:8080/car?name=1test
