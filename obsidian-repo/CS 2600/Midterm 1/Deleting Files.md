To delete a file, we use the `rm` command, like so:

```
$ ls 
file1.txt	file2.txt	file3.txt
$ rm file1.txt
$ ls
file2.txt	file3.txt
```

### -i
In order to get user verification, use the `-i` switch like so:

```
$ ls
file1.txt	file2.txt	file3.txt
$ rm -i file1.txt
rm: remove regular file 'file1.txt'? n		# "n" is a user input
$ ls
file1.txt	file2.txt	file3.txt
$ rm -i file1.txt
rm: remove regular file 'file1.txt'? y
$ ls
file2.txt	file3.txt
```

### Deleting Multiple Files
To delete multiple files, just specify more than one file and they will all remove at once
```
$ ls
file1.txt	file2.txt	file3.txt
$ rm file2.txt file3.txt
$ ls
file1.txt
```
