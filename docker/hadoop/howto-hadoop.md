
cd to location of Hadoop dockerfile, i.e. cd /home/pete/development/gitrepo/learn-presto/docker/hadoop
docker build -t hadoop:2.9.0 .

just to check out the structure, create a container
docker run -it --rm hadoop:2.9.0

install hive
this is a good overview: hive https://www.edureka.co/blog/apache-hive-installation-on-ubuntu
but follow this to configure w/ metastore in mysql: http://hadooptutorial.info/hive-metastore-configuration/
examples https://www.edureka.co/blog/hive-commands-with-examples

start docker hadoop cluster
cd /home/pete/development/gitrepo/learn-presto/docker/hadoop/docker-compose-hadoop.yml
docker-compose -f docker-compose-hadoop.yml up

start docker presto hadoop cluster
cd /home/pete/development/gitrepo/learn-presto/docker/presto
docker-compose -f docker-compose-presto-hadoop.yml up
install and configure hive on the namenode to use mysql as local metastore



run hive
docker exec -it hdfs-datanode2 /bin/bash
cd /usr/local/hive
hive
show databases;