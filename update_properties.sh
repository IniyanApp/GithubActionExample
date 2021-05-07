#!/bin/bash

# Assign the filename
touch local.properties
echo "BASE_URL=\"$1\"" >> local.properties
echo "API_URL=\"$2\"" >> local.properties
#echo "gateway=$3" >> local.properties
#echo "appType=$4" >> local.properties
