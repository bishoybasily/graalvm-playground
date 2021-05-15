#!/bin/bash

jar=$1
config_dir=$2
name=$3

java \
  -agentlib:native-image-agent=config-output-dir="${config_dir}" \
  -jar "${jar}" com.gmail.bishoybasily.Capitalize capitalize bishoy

native-image \
  -jar "${jar}" \
  -H:Name="${name}" \
  --no-fallback \
  --no-server \
  --allow-incomplete-classpath \
  --report-unsupported-elements-at-runtime \
  --initialize-at-build-time \
  -H:+PrintClassInitialization \
  -H:+ReportExceptionStackTraces \
  -H:ConfigurationFileDirectories="${config_dir}"