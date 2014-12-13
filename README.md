dezyre-players
===============

Flume, PIG and Sqoop players Big Data Project

Setup single node Hadoop on Mac
================================
<ol>
 1. install brew
</ol>
```
ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

<ol>
 2. install hadoop, hive, zookeeper, sqoop
</ol>
```
$ brew install hadoop
$ brew install hive
$ brew install zookeeper
$ brew link zookeeper
```
<ol>
 3. Download sqoop and setup mysql driver
</ol>
```
a. Go to http://www.carfab.com/apachesoftware/sqoop/1.4.5/
b. Download sqoop-1.4.5.bin__hadoop-2.0.4-alpha.tar.gz
c. untar it to home dir ~/sqoop-1.4.5.bin__hadoop-2.0.4-alpha
d. Download mysql-connector-java-5.*.*-bin.jar.zip from internet
e. place it in the lib dir of ~/sqoop-1.4.5.bin__hadoop-2.0.4-alpha/lib
```
<ol>
4. Download Flume and setup flume-conf.properties
</ol>
```
export JAVA_HOME=$(/usr/libexec/java_home)

1. Download Apache Flume tarball from http://flume.apache.org/ through one of the mirror sites
2. Untar apache-flume-1.5.2-bin.tar.gz
3. mv apache-flume-1.5.2-bin to home directory
4. generate flume-conf.properties file
```
<ol>
5. run flume-ng agent with flume-conf.properties file being set
</ol>
```
./flume-ng agent -n agent -c conf -f /Users/rashmi/apache-flume-1.5.2-bin/conf/flume-conf.properties
```

<ol>
6. Install PIG from homebrew
</ol>
```
$ brew install pig
```
<ol>
7. Execute palyers.pig script
</ol>
```
players = LOAD '/user/rashmi/players/runs' USING PigStorage (',') as (player_id:int,year:int,country:chararray,opposition_team:chararray,runs_scored:int,balls_played:int);
player_data = FOREACH players GENERATE player_id,runs_scored,balls_played;
grpd = GROUP player_data BY player_id;
smmd = FOREACH grpd GENERATE group, SUM(player_data.runs_scored), SUM(player_data.balls_played);
DUMP smmd;
STORE smmd INTO '/user/rashmi/players/output';
```
<ol>
8. Install MySQL and start MySQL server
</ol>
```
$brew install mysql
$/usr/local/Cellar/mysql/5.6.19/bin/mysql.server start
```
9. Create players and players_data table in mysql
</ol>
```
create database players;
use players;
grant all privileges on players.* to ''@localhost ;
flush privileges;
create table players_data(player_id int(11), runs_scored BIGINT(20), balls_played BIGINT(20));
```

<ol>
10. Run sqoop
</ol>
Export PIG output into MySQL
```
$ sqoop export --connect jdbc:mysql://localhost/players --table players_data --export-dir /user/rashmi/players/output --username root --input-fields-terminated-by '\t' --input-lines-terminated-by '\n'

NOTE: database players and table players_data should be created in mysql before executing the sqoop job
```
