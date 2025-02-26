Refer to [[Basic Commands#Creating Files|Basic Commands]] for basic file creation commands

If a file does not exist, `touch` can create it. However, when the file does exist, `touch` will just update the time stamp of the file

Updating the time stamp is not why touch is presented, it is just used as a quick way to create an empty file

```
$ ls
dir1 file.txt
$ touch newfile.txt
$ ls
dir 1 file.txt newfile.txt
$
```

Using `touch` we can also create multiple files at once, like so:
```
$ ls
dir 1 file.txt newfile.txt
$ touch hi.py Main.java
dir 1 file.txt newfile.txt hi.py Main.java
$
```