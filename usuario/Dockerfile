# FROM openjdk:8 AS BUILDER
# WORKDIR /build-source/
# COPY . /build-source/
# RUN ./mvnw clean package


FROM openjdk:8
WORKDIR /app
COPY ./target/auth-*.jar /app/auth.jar
# COPY --from=BUILDER /build-source/auth/target/auth-*.jar /app/auth.jar
CMD java -jar auth.jar