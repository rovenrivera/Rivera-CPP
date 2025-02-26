`tree` displays the file hierarchy, starting with either:
- the current directory
- the specified directory

```
$ tree
.
└── cs2600
    ├── day5
    │   ├── ex1
    │   │   └── sample.bash
    │   ├── ex2
    │   │   └── myproc.c
    │   ├── ex3
    │   │   └── secret_pwd
    │   └── intro.pdf
    └── notes.txt

5 directories, 5 files
$ tree day5
day5
├── ex1
│   └── sample.bash
├── ex2
│   └── myproc.c
├── ex3
│   └── secret_pwd
└── intro.pdf

3 directories, 4 files
```

`tree` is also able to take in both *absolute* and *relative* path directories as parameters.
