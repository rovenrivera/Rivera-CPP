For every file on Unix, it belongs to 3 entities:
- an [^1]owner: single user
- a [^2]group: a collection of 0+ users
- everyone else on the system

```
$ ls -alF
# total of 20 files but here are examples of ones with special permissions
drwx------	2	instructor	instructor	4096	Sep 27	16:14	./
drwxrwxrwt 15 	root	root 	12288	Sep 27	16:14	../
-rw-------  1 instructor	cs2600	29	Sep 27	16:14	instructor.dat
```

`instructor.dat` has two names associated with it in columns 3 and 4.
- column 3 indicates the owner, which is the `instructor`
- column 4 indicates the group ownership, which is `cs2600`

### Changing Ownership
File ownership can be changed *only* by `root`, but the owner of the file can change the group. However, they can only change the group if the owner is *in the group* it is being changed to.


[^1]: a user that usually created the file; an owner can be changed/set by the *root* user

[^2]: an identifier given to represent a collection of users; provides a means for several users to access a common file/directory
