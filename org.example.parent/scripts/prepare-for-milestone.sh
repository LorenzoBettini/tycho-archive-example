#!/bin/sh

if [ $# -eq 0 ]; then
    echo "No arguments provided: pass the milestone, e.g., M1"
    exit 1
fi

script_dir="$(dirname "${BASH_SOURCE:-$0}")"

${script_dir}/replace-qualifier-with-timestamp.sh && \
${script_dir}/set-milestone-poms.sh $1