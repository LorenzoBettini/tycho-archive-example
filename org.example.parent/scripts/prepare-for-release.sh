#!/bin/sh

script_dir="$(dirname "${BASH_SOURCE:-$0}")"

${script_dir}/replace-qualifier-with-timestamp.sh && \
${script_dir}/remove-snapshots-poms.sh