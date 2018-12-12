#!/bin/sh
set -e

if [ -n "$TZ" ]; then
  echo setting timezone $TZ
  cp /usr/share/zoneinfo/$TZ /etc/localtime
  echo $TZ >/etc/timezone
fi
mkdir -p /run/proftpd && chown proftpd /run/proftpd/

if [ -f /run/secrets/proftpd.passwd ]
then
    cut -d ':' -f 3,4,6 /run/secrets/proftpd.passwd|grep -v '#'|sed 's/:/ /g' | while read uid gid path
    do
        if [ ! -d "$path" ]
        then
            echo "creating missing home directory $path"
            mkdir -p "$path"
            chown $uid:$gid "$path"
        fi
    done
fi

exec proftpd --nodaemon -c /etc/proftpd/proftpd.conf