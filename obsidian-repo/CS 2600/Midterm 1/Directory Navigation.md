The `cd` command is used to *change directory*.

When logging into a Unix system, you're put into the *home* directory by default, which on most Linux systems will be `/home/USERNAME`.

In order to move around the hierarchal Unix file system, we use the `cd` command and provide it the location we'd like to go into:
```
$ pwd		# print working directory - the current directory
/home/instructor
$ ls -F
other_stuff/
$ cd other_stuff
$ pwd
/home/instructor/other_stuff
```

### Paths
To move into a target directory without having to move in single-directory increments, we can provide *paths* for the `cd` command:
```
$ pwd
$ /home/instructor/other_stuff
$ cd /home/instructor/cs2600/hw1
$ pwd
$ /home/instructor/cs2600/hw1
```

### Absolute Paths
`cd` can take [^1]absolute paths as a parameter.

For example, the directory we just navigated into, `/home/instructor/cs2600/hw1` is an *absolute path* since the first component is `/ ...` which indicates the root of the Unix file system.

### Relative Paths
`cd` is also able to take [^2]relative paths as a parameter.

For example:
```
$ pwd
/home/instructor
$ cd cs2600/hw1
$ pwd
/home/instructor/cs2600/hw1
```

Here, the *relative path* is `cs2600/hw1`

### No Argument
Providing `cd` with no directory takes you to your home directory.
```
$ pwd
/home/instructor/cs2600/hw1
$ cd
$ pwd
/home/instructor
```

### ..
Sometimes, we want to provide a relative path while still being able to move *up* the directory. In order to do so, we can use the `..` argument which indicates, "back up one level of the hierarchy."

Provided is an example for the instructor's system:
```
$ pwd
/home/instructor/data/instruction/cal_poly_pomona/CS_2600/2018_fall_students
$ cd ../../../../bin
$ pwd
$ /home/instructor/data/instruction/bin
```

### .
While `..` enables you to move *up* the directory, the `.` argument indicates "this directory," or the current working directory.

You wouldn't really use `.` with cd but you will need to be aware of it.

### Special Character: ~
In Unix, the tilde (~) is used as a symbol to indicate the current user's home directory, we can use it to cd to the home directory or the start of a path.
```
$ pwd
/home/instructor/code/project1/source
$ cd ~
$ pwd
/home/instructor
$ cd /../../code/project1/source
$ cd ~/public_html
$ pwd
/home/instructor/public_html
```

### Special Character: -
Another symbol that indicates a location is a dash (-). This indicates the most recent directory we were in.
```
$ pwd
/home/instructor/code/project1/source
$ cd ~
$ pwd
/home/instructor
$ cd -
$ pwd
/home/instructor/project1/source
```


[^1]: a path which starts at the root directory

[^2]: a path which starts at the current location
