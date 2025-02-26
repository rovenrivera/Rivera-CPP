Most UNIX systems have manuals documenting installed commands and C functions. These manual pages, showing documentation of particular commands, can be accessed using the `man` command.

For example, if we wanted to get the documentation on the `ls` command:
```
$ man ls
```

The Unix Manual is broken up into sections with each section pertaining to a specific command, function, file type, etc.

If the command you want to see documentation on is not unique, you will need to specify the section, which you can see using the `-f` switch like so:
```
$ man -f printf
printf (3)           - formatted output conversion
printf (1)           - format and print data
$ man 3 printf
```