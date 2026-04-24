def cal(String projectName, String ImageTag, String DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${projectName}:${latest} ."
}
