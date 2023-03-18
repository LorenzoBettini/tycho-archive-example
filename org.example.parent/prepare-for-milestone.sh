#!/bin/sh

if [ $# -eq 0 ]; then
    echo "No arguments provided: pass the milestone, e.g., M1"
    exit 1
fi

./replace-qualifier-with-timestamp.sh && \
./set-milestone-poms.sh $1