#!/bin/bash

# Assign the filename

filename="local.properties"
if [ -e "$filename" ]; then
  sed -i "s,.*FE_BASE_URL.*,BASE_URL=\"$1\"," $filename
  sed -i "s/.*GATEWAY.*/MAP_KEY=\"$2\"/" $filename
  sed -i "s/.*API_URL.*/RETRY_ATTEMPTS=$3/" $filename
  sed -i "s/.*APP_TYPE.*/THRESHOLD_VALUE=$4/" $filename
else
  touch local.properties
  echo "FE_BASE_URL=\"$1\"" >> local.properties
  echo "GATEWAY=\"$2\"" >> local.properties
  echo "API_URL=$3" >> local.properties
  echo "APP_TYPE=$4" >> local.properties
fi
