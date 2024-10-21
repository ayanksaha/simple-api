### The Simple API

This has a bare minimum Spring-boot web POST API that receives a request and maps it to response and returns it.

Sample CURL:

```
curl --location 'http://localhost:8080/simple/api' \
--header 'Content-Type: application/json' \
--data '{
    "game": "Mobile Legends",
    "gamer_id": "GYUTDTE",
    "points": 20
}'
```

Sample Response:

```
{
    "game": "Mobile Legends",
    "points": 20,
    "gamer_id": "GYUTDTE"
}
```

It also has a GET health API that can be used to get the current server status.

```
curl --location 'http://localhost:8080/health'
```

Sample Response:

```
{
    "status": "OK"
}
```

