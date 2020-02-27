// src/org/foo/Zot.groovy
package org.foo

def checkOutFrom(String repo = 'default') {
    echo "Repo is ${repo}"
    pipeline {
    agent { docker { image 'python:3.5.1' } }
    stages {
        stage('build') {
            steps {
                script {
                    sh 'ls -al'
                }
            }
        }
    }
    }
}

return this
