To copy a file, the `cp` command is used, which takes at least two parameters:
- source file
- destination file

```
$ ls -F
files1.txt	file2.txt	other_stuff/
$ cp file1.txt other_stuff/file1.txt
$ cd other_stuff
$ ls
file1.txt
```

### Keeping the File Name

If the destination file does not exist, and we want to preserve the same name, the destination file name is unnecessary and the destination directory can just be used:

```
$ ls -F
files1.txt	file2.txt	other_stuff/
$ cp files1.txt other_stuff
$ cd other_stuff
$ ls
file1.txt
```

> **Important Note:**
> If the destination file *does* exist, then the file will be overwritten

### File Globbing
Like other commands, file globbing is allowed when using the `cp` command.



