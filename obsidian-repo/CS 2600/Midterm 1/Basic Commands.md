##### Clearing the Terminal Screen
```
$ clear
# Screen will clear and put a new prompt at top
```

#####  [[Listing Files]]
```
$ ls
# list files in directory
$ ls -a
# lists ALL files in directory
$ ls -l
# lists files in directory WITH details
$ ls -al
# lists ALL files in directory WITH details
```

##### Changing Directories/Moving Around the File System
```
$ cd directory_name
# goes "down" into a directory
$ cd ..
# goes "up" one directory level
$ cd relative_or_absolute_directory_name
# change to a specific directory - "~/Desktop/etc/default"
$ cd
# changes to user's HOME directory
```

##### [[File Viewing|Displaying File Contents]]
```
$ cat file_name
# displays file content
```

##### [[Creating Files]]
```
$ touch file_name
# creates an empty file
$ ls > file_name
# saves command output to file
$ cat > file_name
Hello World # hit control-d to finish
# creates file with content
```

##### Deleting Files/Directories
```
$ rm filename
# Deletes a file
$ rmdir directory_name
# Deletes a directory - NOTE: Directory must be empty
```

##### **Resetting the Terminal**
In case your prompt gets messed up, try typing `reset` then enter, even if it doesn't show up.

