# borrowed partly from https://github.com/instantlinux/docker-tools/tree/master/images/proftpd

FROM alpine:3.19

ENV PROFTPD_VERSION=1.3.8b-r0

RUN apk add --update --no-cache \
        libcrypto3 \
        proftpd=$PROFTPD_VERSION \
        tzdata \
        proftpd-mod_sftp=$PROFTPD_VERSION \
        openssh-keygen

COPY proftpd.conf /etc/proftpd/proftpd.conf
COPY docker-entrypoint.sh /

ENTRYPOINT ["/docker-entrypoint.sh"]
