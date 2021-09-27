# demo-quarkus-panache

This project uses Quarkus, the Supersonic Subatomic Java Framework.

# Running the application in dev mode

You can run your application in dev mode that enables live coding using:
`mvn compile quarkus:dev`

# Packaging and running the application

The application can be packaged using:
`mvn package`

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.

The application is now runnable using: 
`java -jar target/quarkus-app/quarkus-run.jar`

# Creating a native executable

You can create a native executable using: 
`mvn package -Pnative`

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
`mvn package -Pnative -Dquarkus.native.container-build=true`

You can then execute your native executable with: 
`./target/hello-app-quarkus-1.0.0-runner`
