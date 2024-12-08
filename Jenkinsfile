@Library("shared") _

pipeline {
    agent { label "agent1" }
    
    stages {
        stage("Code") {
            steps {
                script{
                    clone("https://github.com/chetangawade/django-notes-app.git", "main")
                }
            }
        }
        stage("Build") {
            steps {
                script{
                    docker_build("note-app","latest")
                }
            }
        }
        stage("Pushing the Image to the Docker Hub") {
            steps {
                script{
                    docker_push("note-app","latest")
                }
            }
        }
        stage("Deploy") {
            steps {
                script{
                    docker_compose()
                }
            }
        }
    }
}
