grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.target.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
    inherits 'global'
    log 'warn'
    repositories {
        grailsCentral()
        mavenRepo 'http://download.newrelic.com/'
    }
    dependencies {
        compile 'newrelic.java-agent:newrelic-api:2.9.0'
    }

    plugins {
        build(':release:latest.integration') {
            export = false
        }
        test ':spock:0.6'
    }
}
