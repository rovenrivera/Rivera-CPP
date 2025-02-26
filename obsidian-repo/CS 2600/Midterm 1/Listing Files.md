Refer to [[Basic Commands#Listing Files|Basic Commands]] for basic list commands

### -a
- List all files including hidden files
```
$ ls -a
. .. file1.txt file2.txt other_stuff
$
```
- Any file or directory starting with a period is not listed unless `-a` is provided, these files or directories are consider *hidden*

### -F
- Adds a character to certain files and directories to indicate which is which
```
$ ls -aF
./ ../ file.txt@ file2.txt* other_stuff/
```

| Char | Meaning                                                       |
| ---- | ------------------------------------------------------------- |
| /    | Entry is a directory                                          |
| *    | Entry is executable                                           |
| @    | File is a "symbolic link", or "symlink" (a pointer to a file) |
### -l
- provides a *long* listing of the contents.
- provides more information about the files and directories
```
$ ls -alF
total 20 
drwx------  3 instructor instructor  4096 Sep  3 21:15 ./
drwxrwxrwt 16 root       root       12288 Sep  3 21:15 ../ 
lrwxrwxrwx  1 instructor instructor     9 Sep  3 21:15 file1.txt -> file3.txt
-rwx------  1 instructor instructor     0 Sep  3 21:14 file2.txt*
-rw-------  1 instructor instructor     0 Sep  3 21:14 file3.txt
drwx------  2 instructor instructor  4096 Sep  3 21:14 other_stuff/
$
```
- Included are:
	- Column 1: Entry type and permission
	- Column 2: Number of hard links
	- Column 3: Owner
	- Column 4: Group Membership
	- Column 5: Size (for files) in bytes
	- Column 6+: Date/time of last modification
	- Column N: Entry's name
