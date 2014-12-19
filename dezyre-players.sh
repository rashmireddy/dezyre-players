#!/bin/bash
export PATH=$PATH:/Users/rashmi/sqoop-1.4.5.bin__hadoop-2.0.4-alpha/bin/
export JAVA_HOME="$(/usr/libexec/java_home)"
 
pig /Users/rashmi/dezyre-players/pig/script/players.pig && \
sqoop export --connect jdbc:mysql://localhost/players --table players_data --export-dir /user/rashmi/players/output --username root --input-fields-terminated-by '\t' --input-lines-terminated-by '\n'
