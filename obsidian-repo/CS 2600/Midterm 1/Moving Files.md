Rather than just copying files, we can also just move them using the `mv` command. Identical to the `cp` command, `mv` takes two parameters:
- source file
- destination file

```
$ ls -F
files1.txt	file2.txt	other_stuff/
$ mv files1.txt other_stuff/file1.txt
$ ls -F
file2.txt other_stuff/
$ cd other_stuff
$ ls
file1.txt
```

For **keeping the file name** and **file globbing**, refer to [[Copying Files]], it remains the same.

### Renaming Files
To rename a file, it is the exact same as moving them but you just do not include any directories:

```
$ ls -F
files1.txt	file2.txt	other_stuff/
$ mv files1.txt fileX.txt
$ ls -F
fileX.txt	file2.txt	other_stuff/
```