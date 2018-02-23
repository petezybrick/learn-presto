
cd to location of Hadoop dockerfile, i.e. cd /home/pete/development/gitrepo/learn-presto/docker/hadoop
docker build -t hadoop:2.9.0 .

just to check out the structure, create a container
docker run -it --rm hadoop:2.9.0

install hive
configure hive https://www.edureka.co/blog/apache-hive-installation-on-ubuntu
