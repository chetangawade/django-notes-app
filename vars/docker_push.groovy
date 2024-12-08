def call(String project_name , String tag){
  withCredentials([usernamePassword(
    credentialsId: "DockerHub-cread", 
    passwordVariable: "dockerHubPass",
    usernameVariable: "dockerHubUser")]) {
        sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
        sh "docker image tag ${project_name}:${tag} ${env.dockerHubUser}/${project_name}:${tag}"
        sh "docker push ${env.dockerHubUser}/${project_name}:${tag}"
    }
}
