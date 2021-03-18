# CommandLine App using picocli

A simple demo to use [picocli](https://picocli.info/#_introduction) with Spring Boot to create a cli java application.

The demo could be built as a dockerized GraalVM native image using ```./mvnw spring-boot:build-image``` command.

To run the command, run the docker image:

to echo with capitalized message option (notice no need to issue the 'echoo' command itself, start from options if any and then parameters)
```shell
docker run -it haybu/demo-picocli:latest -c=yes Haytham
```

that should ech back:

message: HAYTHAM

or with lowercase message option

```shell
docker run -it haybu/demo-picocli:latest -c=no Haytham
```
And that should echo back:

message: Haytham

cool!.