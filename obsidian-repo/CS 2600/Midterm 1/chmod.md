With the `chmod` command, we can change a file's permissions.

The commands takes two arguments, the octal permissions and the file name or glob.

```
$ chmod 000 filename(s)
```

For example:
```
$ ls -alF script.bash
-rw------- 1 instructor instructor 29 Sep 27 16:14 script.bash		# Notice user can read and write but do nothing else (rw)
$ chmod 740 script.bash		# User=7=111; Group=4=100; Other=0=000
$ ls -alF script.bash
-rwxr----- 1 instructor instructor 29 Sep 27 16:14 script.bash		# Now, user can execute and group can read
```

Here, we did three different things with the `chmod` command:
- allowed the owner to READ, WRITE, and EXCUTE the file `script.bash`
- allowed the group to `READ` only
- denied access to everyone else on the system

So, for the `chmod 740 script.bash` command, we break it down into three things:
- for the owner, we used 111 or 7
- for the group, we used 100 or 4
- for everyone else, we used 000 or 0
- 