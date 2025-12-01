pipeline {
    agent {
        // Definicja dynamicznego Agenta Kubernetesa
        kubernetes {
            cloud 'minikube'
            label 'java-25-test-agent'
            yaml """
apiVersion: v1
kind: Pod
spec:
  containers:
  - name: build-tools-agent
    // Używamy Twojego obrazu z Java 25 i Gradle
    image: moj-gradle-agent:1.0
    command: ['/bin/sh', '-c', 'cat']
    tty: true
"""
        }
    }

    environment {
       // REPORT_FILE = 'jenkins_test_report.html'
    }

    stages {
        stage('Checkout') {
            steps {
                // Instrukcje pobrania kodu z Git
                git url: 'TWOJ_URL_DO_REPOZYTORIUM_GIT'
            }
        }

        stage('Build and Test (Java 25)') {
            // Kompilacja i uruchomienie testów przez Gradle w Agencie (JDK 25)
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Generate and Publish Reports') {
            steps {
                // 1. Konwersja raportów testowych (junit2html jest w obrazie Agenta)
               // sh "junit2html build/test-results/test/*.xml --output build/reports/${REPORT_FILE}"

                // 2. Publikacja wyników testów w tabeli Jenkinsa
                junit 'build/test-results/test/*.xml'

                // 3. Publikacja raportu HTML (do widoku)
//                 publishHTML([
//                     allowMissing: false,
//                     alwaysLinkToLastBuild: false,
//                     keepAll: true,
//                     reportDir: 'build/reports',
//                     reportFiles: "${REPORT_FILE}",
//                     reportName: 'HTML Test Report'
//                 ])
            }
        }
    }
}