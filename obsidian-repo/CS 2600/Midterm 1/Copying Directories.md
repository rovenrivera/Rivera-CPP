Just like how we can copy files, we can copy entire directories and all files within it using the `cp` command. However, we *NEED* to use the `-r` switch.

```
$ ls -F
dir1/
$ cp -r dir1 dir2
$ ls -F
dir1/ dir2/
$ tree .
.
├── dir1
│   └── other_stuff
└── dir2
    └── other_stuff

4 directories
$ cp -r dir2 dir1		# Notice how `dir1` already exists
$ tree .
.
├── dir1
│   ├── dir2                    # so the copy went in the target!
│   │   └── other_stuff
│   └── other_stuff
└── dir2
    └── other_stuff
```



