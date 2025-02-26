In order to create a directory, we use the `mkdir` command:
```
$ ls
$ mkdir data
$ ls -F
data/
```

Using the `mkdir` command, we can create a full path of directors using the `-p` switch:
```
$ mkdir -p some/other/path
$ ls -F
data/ some/
$ tree some
some
└── other
    └── path
$ ls -RF some		# -R does a "recursive" ls
some:
other/

some/other:
path/

some/other/path:
```

