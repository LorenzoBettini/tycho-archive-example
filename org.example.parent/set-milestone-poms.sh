#!/bin/sh

mvn \
  build-helper:parse-version \
  versions:set \
  -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion}.M1