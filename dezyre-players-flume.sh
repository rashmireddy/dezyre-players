#!/bin/bash
export PATH=$PATH:/Users/rashmi/apache-flume-1.5.2-bin/bin

flume-ng agent -n agent -c conf -f /Users/rashmi/apache-flume-1.5.2-bin/conf/flume-conf.properties

