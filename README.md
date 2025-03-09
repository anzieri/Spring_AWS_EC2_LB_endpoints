# Spring_AWS_EC2_LB_endpoints
The Spring Boot code that runs on the Compute instance endpoints.Requests come in through from the LoadBalancer and distributed based off the Round-Robin Algorithm. A simple response of the server IP and time at which the response was generated is sent back to the client side.(Flutter app). 

**Major Requirement:** Java, git

## Setup

1. **Clone Repo:**

``` 
git clone "https://github.com/anzieri/Spring_AWS_EC2_LB_endpoints.git"
```

2. **Enter Directory:**

``` 
cd Spring_AWS_EC2_LB_endpoints/executable
```

3. **Run jar file:**

``` 
java -jar bimo-0.0.1-SNAPSHOT.jar
```

4. **Make Request:**

``` 
curl "http://localhost:8080/home"
```
