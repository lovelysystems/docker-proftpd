# Localdev Setup

## Start FTP server locally

```bash
docker compose up -d
```

Test the connection with a FTP client like FileZilla.
Connect to `localhost:2121` with user a user from `proftp.passwd` file. The password is `password`.

## Possible issues

### Permission denied

If the ftp server does not start and you get a permission denied error in the FTP server logs like this

```log
unable to use world-readable AuthUserFile '/run/secrets/proftpd.passwd' (perms 0644): Operation not permitted
```

then you need to change the permissions of the `proftpd.passwd` file to `0400`:

```bash
$ chmod 400 proftpd.passwd
```