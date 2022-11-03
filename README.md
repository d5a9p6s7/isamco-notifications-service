# Notifications Service

## Spring

#### Spring Boot links

    - https://docs.spring.io/spring-boot/docs/current/reference/html/index.html
    - https://spring.io/guides

## Maven

### mvn commands

To build the project:

    - mvn clean package

Run project locally :

    - mvn spring-boot:run -Dspring-boot.run.profiles=local

Deploy project to App Engine:

    - mvn appengine:deploy -Dapp.deploy.projectId=[--projectId] -Dapp.deploy.version=[--version]

## Swagger

#### OpenAPI links

    - https://www.openapis.org/
    - https://spec.openapis.org/oas/v3.1.0
    - https://springdoc.org/
    - https://www.baeldung.com/spring-rest-openapi-documentation
    - https://refactorizando.com/openapi-3-spring-boot/

## Gcloud

#### Gcloud commands

    - gcloud init
    - gcloud config set project PROJECT_ID
    - gcloud config get-value project
    - gcloud auth application-default login

## Internationalization

#### I18n links

    - https://www.javatpoint.com/restful-web-services-internationalization
    - https://www.baeldung.com/spring-boot-internationalization
    - https://phrase.com/blog/posts/spring-boot-internationalization/ 

## UnitTest

#### Unit tests links

    - https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-test-auto-configuration.html#test-auto-configuration
    - https://spring.io/guides/gs/testing-web/

## Git

### Git commands

    - git add .
    - git commit -m "XXXXXX-XX [message]"
    - git push
    - git pull
    - git checkout [branchname]
    - git merge [branchname]

### GitFlow commands

    - git flow init
    - git flow [feature,release,hotfix] start XXXXXX-XX
    - git flow [feature,release,hotfix] finish XXXXXX-XX
