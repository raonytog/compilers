#!/bin/bash

ROOT=/Users/jpalmeida/Documents/ufes/ensino/2025-01-compiladores/workspace
ANTLR_PATH=$ROOT/tools/antlr-4.13.2-complete.jar
CLASS_PATH_OPTION="-cp .:$ANTLR_PATH"

GRAMMAR_NAME=EZ
BIN_PATH=bin

DATA=/Users/jpalmeida/Documents/ufes/ensino/2025-01-compiladores/cc_labs/io
IN=$DATA/in
OUT=$DATA/out03_java

for infile in `ls $IN/*.ezl`; do
    base=$(basename $infile)
    outfile=$OUT/${base/.ezl/.out}
    echo Running $base
    java $CLASS_PATH_OPTION:$BIN_PATH App $infile 2>&1 | diff -y $outfile -
done
