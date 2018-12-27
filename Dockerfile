FROM hub.c.163.com/library/java:8-alpine

MAINTAINER wangzhou 413974736@qq.com

ADD target/*.jar  demo.jar

EXPOSE 8888

ENTRYPOINT ["java","-jar","demo.jar"]