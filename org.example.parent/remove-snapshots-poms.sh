#!/bin/sh

mvn \
  build-helper:parse-version \
  versions:set \
  -DgenerateBackupPoms=false \
  -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion}