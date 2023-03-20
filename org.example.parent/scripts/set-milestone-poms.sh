#!/bin/sh

if [ $# -eq 0 ]; then
    echo "No arguments provided: pass the milestone, e.g., M1"
    exit 1
fi

mvn \
  build-helper:parse-version \
  versions:set \
  -DgenerateBackupPoms=false \
  -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion}.$1