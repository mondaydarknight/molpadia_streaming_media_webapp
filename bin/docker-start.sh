#!/bin/bash

set -x

mkdir -p /opt/app/
ln -s /tmp/build/libs/molpadia_streaming_media_webapp.jar /opt/app

echo "--------------------------------------------"
echo "      Molpadia streaming media service      "
echo "--------------------------------------------"

java -jar /opt/app/molpadia_streaming_media_webapp.jar spring.profiles.active=docker &

tail -f /dev/null
