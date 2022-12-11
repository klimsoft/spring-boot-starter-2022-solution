# spring-boot-starter-2022


- SpringBootStarterIntegrationTest takes long time and we would like it only with profile: integration:
  ./mvnw clean install -P integration

Build image from Dockerfile:
docker build -t boot-starter .

Run sample docker-compose:
docker-compose up -d

Stop sample docker-compose:
docker-compose down