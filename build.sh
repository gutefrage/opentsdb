#!/bin/bash

./src/main/scripts/gen_build_data.sh src/main/java/net/opentsdb/tools/BuildData.java net.opentsdb.tools
gradle build

