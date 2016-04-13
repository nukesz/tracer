# Tracer interceptor

The interceptor log the method invocation events.

Usage:
Add the maven project as a maven depedency
```
<dependency>
			<groupId>com.nukesz</groupId>
			<artifactId>tracer</artifactId>
			<version>0.1</version>
</dependency>
```
Add the interceptor on your EJB:
```
@Interceptors(TracerInterceptor.class)
```
(added a tracer-test project to demonstrate the usage)
