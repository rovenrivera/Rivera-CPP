In a command shell, a typical Linux command prompt may look like so:
```
instructor@deb12vm:~$
```
This *specific* prompt provides us with four pieces of information
- The user: `instructor`
- The computer's hostname: `deb12vm`
- The current directory: `~` (i.e `instructor`'s home directory)
- The user's privileges: `$` indicates a normal user, `#` indicates a root administrator

Doing the following tasks will changes the prompt
- change user accounts
- log on to other machines
- change directories
- gain root privileges
```
instructor@deb12vm:~$ cd /mnt
instructor@deb12vm:/mnt$ su - # gain root privleges              
Password:
root@deb12vm:~# cd /mnt # change directories
root@deb12vm:/mnt# ssh sam@machine2 # changes machines
Password:
sam@machine2:~$ su -
Password:
root@machine2:~# cd /mnt
root@machine2:/mnt#
```
