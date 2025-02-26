## Basic Commands
**Exercise #1**
```
$ cat /proc/cpuinfo
{cpu info}
# processor 0 MHz. = 2593.905
```

**Exercise #2**
```
$ cat /etc/ssh/ssh_config
{ssh_config content}
# GSSAPIAuthentication = no
```

**Exercise #3**
N/A

**Exercise #4**
```
$ touch backit
$ cat > backit
echo "You entered	: $1"
echo "Backwards is	: $(echo $1 | rev)"
{control-d}
$ bash backit 'hello world'
You entered : hello world
Backwards is : dlrow olleh
$
```

**Exercise #5**
```
$ rm backit
$ ls
{files/directories}
```

## ls
**Preparation**
```
$ cd workspace/sp001
```

**Exercise #1**
```
$ ls
{all files}
$ ls -a
{all files including hidden . ..}
$ ls -l
{all files with long listing}
$ ls -aF
{all files with special characters}
```

## touch
**Preparation**
```
$ cd workspace/sp001
```

**Exercise #1**
```
$ touch sample.c
$ ls -l
{can see that sample.c time/date has been updated}
```

**Exercise #2**
```
$ touch file1.txt file2.txt
$ ls -l
{confirmed files created}
```

## cat
**Preparation**
```
$ cd workspace/sp001
```

**Exercise #1**
```
$ cat sample2.c
{sample2.c contents}
$ cat -n sample3.c
{sample3.c contents w/ line numbers}
```

## less
**Preparation**
```
$ cd workspace/sp001
```

**Exercise #1**
```
$ less code.c
{less interface}
/initscr
{using n to go through all occurences of initscr}
# There are 2 occurences of "initscr" in code.c
```

**Exercise #2**
```
$ less code.c
{code.c contents}
# able to scroll
/in
{go through all occurences with n}
$ less sample.c
# unable to scroll, not more than one screenful
/in
{go through all occurences with n}
```

## man
**Exercise #1**
```
$ man -f stat
{all sections for stat listed}
# There are four sections of stat
```

## File Globbing
**Preparation**
```
$ cd workspace/sp001
```

**Exercise #1**
```
$ ls -a *[mM]*.*
{list of files containing m or M}
# dont need the .*
```

## tmux
**Exercise #1**
```
$ tmux
{open tmux session}
{control-b}" # split horizontally
{control-b}% # split vertically
{control-b}o # go to top pane
$ echo "Hello World"
Hello World
$
{control-b}o # go to next pane
$ {ENTER}
$
{control-b}o # go to next pane
{control-b}t # open clock
```

## mkdir
**Exercise #1**
```
$ mkdir practice04
$ cd practice04
$ mkdir dir1
$ cd dir1
$ mkdir subdir1 subdir2 subdir3
$ cd ..
$ mkdir dir2
$ cd dir2
$ mkdir subdir1 subdir2 subdir3
```

## Editing a File
**Exercise #1**
```
$ cd practice04/dir1/subdir2
$ nano myscript.bash
{input script}
{control-x}
{y}
{ENTER}
$ bash myscript.bash
```

**Exercise #2**
```
$ cd practice04/dir1/subdir1
$ vi myscript.bash
{input script}
{ESC}
{:w}
{ESC}
{:q}
$ bash myscript.bash
```