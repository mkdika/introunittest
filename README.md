# Intro To Unit Test 

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](/LICENSE)

This is the sample code repository for my presentation at [KongKow IT Medan](https://kongkowitmedan.github.io/meetup/) meetup __#12 - Intro to Unit Test & Metrics__.



## Running the Test

#### 1. Run Unit Test & Coverage

From the project root folder, execute:

```console
mvnw clean test
```

you will need to have reliable internet connection to allow maven download all related dependencies. 



#### 2. View the Coverage Test Result

To view the coverage test result, open the file at: `target/site/jacoco/index.html`



#### 3. Run Mutation Test & Result

From the project root folder, execute:

```console
mvnw org.pitest:pitest-maven:mutationCoverage
```

Check folder and open file `target/pit-reports/<YYYYMMDDHHMI>/index.html`, for PiTest mutation test result.



## Slides

- [Meetup Slides](https://speakerdeck.com/mkdika/intro-to-java-unit-test-and-metrics)




## License
Licensed under the MIT License. See [LICENSE](/LICENSE) file.