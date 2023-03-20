#!/bin/sh

mvn \
  -Preplace-qualifier-with-timestamp \
  build-helper:parse-version \
  build-helper:timestamp-property@timestamp \
  org.eclipse.tycho:tycho-versions-plugin:set-version \
  -DnewVersion=\${parsedVersion.majorVersion}.\${parsedVersion.minorVersion}.\${parsedVersion.incrementalVersion}.\${computedTimestamp} \
  -DgenerateBackupPoms=false