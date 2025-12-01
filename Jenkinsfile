pipeline {
    agent {
        // Używamy etykiety, która musi być zdefiniowana w konfiguracji Chmury Kubernetes
        // Ta etykieta uruchomi dynamicznego Poda z obrazem 'moj-gradle-agent:1.0'
        label 'build-tools-agent'
    }

    // Usunięto pusty blok environment { }

    options {
        // Włączamy opcję, aby usunąć Poda Agenta po zakończeniu Pipeline
        skipDefaultCheckout()
    }

    stages {
        stage('Checkout') {
            steps {
                // Instrukcje pobrania kodu z Git
                // UWAGA: Użyj HTTPS, aby uniknąć błędów klucza SSH
                git url: 'https://github.com/gacandrzej/Cw6JavaKlasyDziedziczenie.git'
            }
        }

        stage('Build and Test (Java 25)') {
            steps {
                // 1. Ustaw uprawnienia do wykonania skryptu Gradle Wrapper
               // sh 'chmod +x gradlew'
                // 2. Uruchom build
                sh './gradlew build'
            }
        }

        stage('Publish Test Reports') {
            steps {
                // Publikacja wyników testów w tabeli Jenkinsa (wymaga wtyczki JUnit)
                junit 'build/test-results/test/*.xml'
            }
        }

        // Zostawiam ten etap zakomentowany, ponieważ wymaga wtyczki 'publish-over-html'
        /*
        stage('Generate and Publish Reports') {
            steps {
               sh "echo 'Brak wtyczki publish-over-html, pomijam raport HTML.'"
            }
        }
        */
    }
}