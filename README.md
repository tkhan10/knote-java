### Clone below project using git clone command
github - https://github.com/tkhan10/knote-java.git

1. git clone https://github.com/tkhan10/knote-java.git
2. go inside project using comming - cd knote-java
3. run "mvn clean install" command to build.

### Using this docker-compose below is the way to run
1. docker-compose build
   1. This command build the image in local.
2. docker-compose up
   1. This run the image which we build just now.

### You can test this after hitting below url in browser or postman
      http://localhost:8080/notes/

### Push docker image to AWS ECR
Run below command to push image to ECR
1. Retrieve an authentication token and authenticate your Docker client to your registry. Use the AWS CLI:
aws ecr get-login-password --region us-east-2 | docker login --username AWS --password-stdin 326522136754.dkr.ecr.us-east-2.amazonaws.com
Note: If you receive an error using the AWS CLI, make sure that you have the latest version of the AWS CLI and Docker installed.

2. Build your Docker image using the following command. For information on building a Docker file from scratch see the instructions here . You can skip this step if your image is already built:
docker build -t tofek/tofek-image-store .

3. After the build completes, tag your image so you can push the image to this repository:
docker tag tofek/tofek-image-store:latest 326522136754.dkr.ecr.us-east-2.amazonaws.com/tofek/tofek-image-store:latest

4. Run the following command to push this image to your newly created AWS repository:
docker push 326522136754.dkr.ecr.us-east-2.amazonaws.com/tofek/tofek-image-store:latest
