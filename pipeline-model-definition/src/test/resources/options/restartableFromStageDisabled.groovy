pipeline {
    agent none
    options {
        disableRestartFromStage()
    }
    stages {
        stage("foo") {
            steps {
                echo "hello"
            }
        }
    }
}