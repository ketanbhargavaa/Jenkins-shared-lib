def cal(String projectName, String ImageTag, String DockerHubUser){
  echo 'this is building the code'
  sh "docker build -t ${DockerHubUser}/${projectName}:${latest} ."
  echo 'image build successfully'
}
