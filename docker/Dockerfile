# borrowed partly from https://github.com/instantlinux/docker-tools/tree/master/images/proftpd

FROM alpine:3.8
RUN echo '@edge http://dl-cdn.alpinelinux.org/alpine/edge/main' \
      >>/etc/apk/repositories && \
    echo '@testing http://dl-cdn.alpinelinux.org/alpine/edge/testing' \
      >>/etc/apk/repositories
RUN apk add --update libcrypto1.1@edge proftpd@testing=1.3.6-r6 proftpd-mod_auth_file@testing=1.3.6-r6 tzdata

RUN apk add --update --no-cache proftpd

COPY proftpd.conf /etc/proftpd/proftpd.conf
COPY docker-entrypoint.sh /

ENTRYPOINT ["/docker-entrypoint.sh"]

#CMD proftpd --nodaemon -c /etc/proftpd/proftpd.conf
#CMD ls -alh /run/secrets/
