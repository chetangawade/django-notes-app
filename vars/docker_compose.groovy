def call(){
  echo "This is Deploy the code"
  sh "docker-compose down && docker-compose up -d"
}
