pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Test') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/hexfo-428/MSPR_DEV.git'

                // Run Maven on a Unix agent.
                //sh "mvn -Dmaven.test.failure.ignore=true clean test"

                // To run Maven on a Windows agent, use
                 bat "mvn -Dmaven.test.failure.ignore=true clean test"
            }

            
        }
        stage('Sonar') {
                steps {
                // Get some code from a GitHub repository
                git 'https://github.com/hexfo-428/MSPR_DEV.git'

                // Run Maven on a Unix agent.
               // sh "mvn -Dmaven.test.failure.ignore=true clean test"

                // To run Maven on a Windows agent, use
                 bat "mvn -Dmaven.test.failure.ignore=true mvn clean verify sonar:sonar -Dsonar.projectKey=SONARQUBE -Dsonar.host.url=http://localhost:9000 -Dsonar.login=3dd47118f49254a490661d39442b9e71f6a64062"
                }
             }
             stage('Buils') {
                steps {
                // Get some code from a GitHub repository
                git 'https://github.com/hexfo-428/MSPR_DEV.git'

                // Run Maven on a Unix agent.
               // sh "mvn -Dmaven.test.failure.ignore=true clean test"

                // To run Maven on a Windows agent, use
                 bat "mvn -Dmaven.test.failure.ignore=true clean package"
                }
             }
           
        }
    
}

