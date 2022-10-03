#! /usr/bin/bash

docker build -t siarheisvila/users-application:1.0.0 ./
docker push -t siarheisvila/users-application:1.0.0
docker-compose up -d