*File Globbing* is the process where the use of "wildcard" characters specify a collection of files in certain circumstances

| Wild Card | Meaning                                         |
| --------- | ----------------------------------------------- |
| *         | Match any number of charcaters (including none) |
| ?         | Match a single character                        |
| []        | Match a class, or group, of characters          |

For example. let's say a user wants to list out all of their MP3 files:
```
$ ls -alF *.mp3
```

Or list files that start with 's' and end with 't' with only one character in between them with any extension:
```
$ ls -alF s?t.*
```

Or list all files that start with a digit:
```
$ ls [0123456789]*
```

Or show java source code files that contain a digit in its file name:
```
$ ls *[0123456789]*.java
```