# Car Parking Services

## Spring

#### Spring Boot links

    - https://docs.spring.io/spring-boot/docs/current/reference/html/index.html
    - https://spring.io/guides

### Spring Boot Devtools

    - https://www.youtube.com/watch?v=Dpk-RUsZBug&ab_channel=CodeJava
    - https://github.com/GoogleCloudPlatform/cloud-sql-jdbc-socket-factory/issues/219
    - https://github.com/GoogleCloudPlatform/cloud-sql-jdbc-socket-factory/blob/main/docs/jdbc-postgres.md
    - https://cloud.google.com/sql/docs/mysql/connect-app-engine-standard?hl=es-419

## Maven

### mvn commands

To build the project:

    - mvn clean package

Run project locally :

    - mvn spring-boot:run -Dspring-boot.run.profiles=local

Deploy project to App Engine: [develop]

    - mvn appengine:deploy -Dapp.deploy.projectId=casapp-services -Dapp.deploy.version=[--version]

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

#### Gcloud SQL links

    - https://spring.io/projects/spring-cloud-gcp
    - https://www.youtube.com/watch?v=D1GJKd62l-A&ab_channel=DATACLOUDER
    - https://adamofig.medium.com/spring-boot-y-google-cloud-sql-cloud-app-engine-la-forma-m%C3%A1s-f%C3%A1cil-ca1c3f5a051
    - https://github.com/adamofig/spring-google-sql-cloud-archetype

## Firebase

#### Firebase links

    - https://firebase.google.com/docs/auth/admin/manage-users#java
    - https://blog.nearsoftjobs.com/spring-boot-oauth2-firebase-d8a4bf37ce15
    - https://medium.com/@purikunal22/securing-springboot-api-using-firebase-authentication-16d72dd250cc

## Internationalization

#### I18n links

    - https://www.javatpoint.com/restful-web-services-internationalization
    - https://www.baeldung.com/spring-boot-internationalization
    - https://phrase.com/blog/posts/spring-boot-internationalization/ 

## OAuth

#### OAuth links

    - https://developers.google.com/identity/protocols/oauth2
    - https://spring.io/guides/tutorials/spring-boot-oauth2/
    - https://spring.io/projects/spring-security-oauth
    - https://somospnt.com/blog/158-securizando-mi-api-con-spring-security-y-oauth-2-0
    - https://medium.com/redbee/implementando-oauth-2-con-spring-y-java-based-config-dabdc1926ae6

## UnitTest

#### Unit tests links

    - https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-test-auto-configuration.html#test-auto-configuration
    - https://spring.io/guides/gs/testing-web/

## Git

### Git commands

    - git add .
    - git commit -m "CASAPP-XX [message]"
    - git push
    - git pull
    - git checkout [branchname]
    - git merge [branchname]

### GitFlow commands

    - git flow init
    - git flow [feature,release,hotfix] start CASAPP-XX
    - git flow [feature,release,hotfix] finish CASAPP-XX

## Storage

#### Gcloud Storage links

    - https://cloud.google.com/storage
    - https://cloud.google.com/storage#section-4
    - https://cloud.google.com/storage/docs/reference/libraries
    - https://cloud.google.com/storage/docs/how-to
    - https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/resources.html