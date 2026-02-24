# Use an official Eclipse Temurin runtime as a parent image
FROM eclipse-temurin:17-jdk-jammy

# Set the working directory in the container
WORKDIR /app

# Copy the current directory contents into the container at /app
COPY . .

# Compile the Java code
RUN javac GreetingApp.java

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Define environment variable
ENV NAME World

# Run the application when the container launches
CMD ["java", "GreetingApp"]
