[![Build Status](https://travis-ci.org/sonyxperiadev/lumber-mill.svg?branch=master)](https://travis-ci.org/sonyxperiadev/lumber-mill) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.sonymobile/lumbermill-core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.sonymobile/lumbermill-core)
# Lumber Mill

*Lumber Mill is under heavy development/refactoring so expect api changes to occur*

### What is Lumber Mill?
Lumber Mills main purpose is to act as a Logstash / Beat when you want to collect logs on AWS infrastructure.
Lumber Mill can easily be deployed as an AWS Lambda and subscribe to events from Cloudwatch Logs, S3 and Kinesis.

You can also use Lumber Mill to create http adapters for ingesting data into AWS infrastructure or simply run Lumber Mill 
scripts as one time jobs instead of using AWS Cli or similar.

### Documentation
* [Wiki](https://github.com/sonyxperiadev/lumber-mill/wiki/)
* Simple samples are in the lumbermill-simple-samples directory
* AWS+Advanced Samples are in  [https://github.com/sonyxperiadev/lumber-mill-samples](https://github.com/sonyxperiadev/lumber-mill-samples)

### Code-As-Config
Lumber Mill is an *API* with fine-grained functions and uses RxJava as pipeline. You write Lumber-Mill scripts in groovy or java (scala, clojure and other jvm languages "probably" works as well but have not been explored).

### Goals
* Lumber Mill is not trying to replace Logstash or Beats or any other log collecting framework. 
It tries to fill the gap that we think exists when running on AWS.
* API and Code instead of configuration to make it easy to extend and adapt. Developers have the full power to 
use the complete Java8 platform and any framework they may need.
* Simple and Fun

### Background
The project started after struggling to make Logstash do **exactly** what we wanted to do on AWS and
Lumber Mill is the third generation of this project that we decided to open source. We have been running
earlier versions in production for more than a year.

### Samples
Samples are found in [https://github.com/sonyxperiadev/lumber-mill-samples](https://github.com/sonyxperiadev/lumber-mill-samples) repository


### Changes
[View Changelog](CHANGELOG.md)

### Build

    ./gradlew clean build
    
### Binaries

Maven

    <dependency>
          <groupId>com.sonymobile</groupId>
          <artifactId>lumbermill-aws-lambda</artifactId>
          <version>0.0.18</version>
    </dependency>

Gradle

    compile 'com.sonymobile:lumbermill-aws-lambda:0.0.18'
    
### Docker

Try out some samples, [Docker on the wiki](https://github.com/sonyxperiadev/lumber-mill/wiki/0.1.-Run-with-docker)

This will run and list available samples you can run

    docker run lifelog/lumber-mill 
    
### \*.internal.\*

All code inside the \*.internal.\* packages is considered private API and should not be relied upon at all. It can change at any time.
    
