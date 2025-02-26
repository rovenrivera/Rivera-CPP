In a long directory listing, like such:

```
$ ls -alF
-rw-------	1	instructor	instructor	 29	Sep 27	16:14	instructor.dat
drwx------	2	instructor	instructor 4096	Sep 27	16:14	stuff/
```

The first column of information represents the file's type and permissions.

The type can be one of the several options:
- -: a normal file
- d: a directory
- c: a character device (ie. data stream devices like video cameras or a microphone)
- b: a block device (disks, USB drives, etc.)

### Permissions
The permissions are indicated by the 9 right-most positions, these are called "bits" and are split into 3 groups of 3.

Each triplet means each of the following:
- Bit 1: READ - `r` if the entity can read the file, `-` if not
- Bit 2: WRITE - `w` if the entity can write the file, `-` if not
- Bit 3: EXECUTE - `x` if the entity can execute the file, `-` if not

The [^1]first triplet represents the permissions for the user owner of the file - user.
The [^2]middle triplet represents the permissions for the group owner of the file - group.
The [^3]last triplet represents the permissions for everyone else on the system - other.

### Expressing Permissions using Numbers
Permissions for an entity (User, Group, Other) is usually expressed as an integer, representing the 3 bits - 1 for on and 0 for off

For example, to allow READ permissions but nothing else:
- the first bit would be 1
- the second bit would be 0
- the third bit would be 0
Which would result in a binary number of '100' and a [^4]decimal number of '4'.

To allow READ and EXECUTE only:
- the first bit would be 1
- the second bit would be 0
- the third bit would be 1
Resulting in a binary number of '101' and a decimal number of '5'

### Octal Representation
An *octal* number is a number in the base-8 number system, therefore, the possible digits are 0-7. Octal numbers often look like decimal numbers since 0-7 is also in the base-10 number system.

Since there are 3 entities to describe permissions for, the result would be 3 integers. Therefore, we can use an octal number to describe the permissions of all 3 entities at once.

If we want to allow the *owner* to READ and WRITE, the binary number would be 110 or 6 in octal.
If we want to allow the *group* to READ only, the binary number would be 100 or 4 in octal.
If we want to allow everyone else to do nothing, the binary number would be 000, or 0 in octal.
As a result, the octal number would be **640**.

It is important to specify that these are *octal* numbers rather than decimal numbers since permissions for a file **should never** have digits outside the octal number system.

[^1]: represents the owner

[^2]: represents the group

[^3]: represents everyone else

[^4]: base 10 number system
