Create the Presto image

cd to location of Presto dockerfile, i.e. cd /home/pete/development/gitrepo/learn-presto/docker/presto
docker build -t presto:0.194 .

just to check out the structure, create a container
docker run -it --rm presto:0.194

Remove danglers from iterative builds
docker rmi $(docker images -qa -f 'dangling=true')

