Much like moving files with the command `mv`, we can do the exact same thing with directories:
```
$ ls -F
dir1/	dir2/
$ mv dir2 other_stuff
$ ls -F
dir1/	other_stuff/
$ mv other_stuff dir1
$ ls -F
dir1/
$ tree.
.
└── dir1
   	└── other_stuff

2 directories, 3 files
```

> Be careful when renaming directories. If the target directory already exists, you won't rename it, you will move its *entire* tree into the target.



