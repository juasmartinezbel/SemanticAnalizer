#!/bin/bash
export CLASSPATH='/home/zebitas/LENGUAJES/antlr-4.6-complete.jar:$CLASSPATH' 
java org.antlr.v4.Tool MyLanguage.g -visitor -o src/classes/ -package classes

