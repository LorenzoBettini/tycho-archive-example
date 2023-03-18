#!/bin/sh

mvn \
  build-helper:parse-version \
  versions:set \
  -DgenerateBackupPoms=false \
  -DremoveSnapshot=true