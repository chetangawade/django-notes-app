def call(String project_name , String tag){
  echo "This is build the code"
  sh "docker build -t ${project_name}:${tag} ."
}
