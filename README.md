# Example OSGi portlet

This application serves as a small example portlet that can be used in
an OSGi-compliant ecosystem, in this case Liferay 7.

## Prerequisites:

- JDK11
- Maven > 3
- Internet connection to resolve dependencies


## Local execution

For development purposes, the application can be run as servlet in a
local Jetty environment, without the need to set up and host a local
OSGi environment.

To run the application as servlet locally, check out the latest commit
locally, and run the following command in your command line:

```
mvn -P no-liferay clean jetty:run
```

This will run the server listening on the localhost port 8080 and can be
accessed via `http://localhost:8080`.

## Create an OSGi bundle

In order to provide the application as an OSGi bundle, run the following
command:

```
mvn -P liferay clean package
```

This will create the OSGi bundle as JAR archive under the directory
`target` in the working directory.
