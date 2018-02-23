
cd to location of ubuntu dockerfile, i.e. cd /home/pete/development/gitrepo/learn-presto/docker/ubuntu-java-python-nano
docker build -t ubuntu-java-python-nano:14.04.5 .

just to check out the structure, create a container
docker run -it --rm ubuntu-java-python-nano:14.04.5
