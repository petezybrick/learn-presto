Create the Presto image

create MySQL for demo


download  https://repo1.maven.org/maven2/com/facebook/presto/presto-server/0.194/presto-server-0.194.tar.gz
download jdk: server-jre-8u162-linux-x64.tar.gz
copy both to the docker/presto folder

cd to location of Presto dockerfile, i.e. cd /home/pete/development/gitrepo/learn-presto/docker/presto
docker build -t presto:0.194 .

just to check out the structure, create a container
docker run -it --rm presto:0.194

Remove danglers from iterative builds
docker rmi $(docker images -qa -f 'dangling=true')

launch the cluster
docker-compose up

Update the MySQL root to be able to connect from any address
docker exec -it presto-mysql /bin/bash
mysql -u root -p
mysql> GRANT ALL PRIVILEGES ON *.* TO 'root'@'%' IDENTIFIED BY 'Password*8';
mysql> FLUSH PRIVILEGES;

Load the Employees test database
Download zip from https://github.com/datacharmer/test_db to docker/presto/data
Note that this is now accessible from presto-mysql as /tmp/data
Unzip the file to docker/presto/data
cd /tmp/data/test_db-master

mysql -t -u root -p < employees.sql

Delete test_db-master from presto/data


 
 
