#!/bin/bash
mvn clean install -DskipTests
docker build -t yti-codelist-common-model:latest .
