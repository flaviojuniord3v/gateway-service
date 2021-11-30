#Docker commands

./gradlew bootBuildImage --imageName=gateway-service/gateway-service-docker

docker run -p 8080:8080 -t gateway-service/gateway-service-docker