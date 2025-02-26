In order to delete a directory, there are two options we can use:
- `rmdir`
- `rm`, as with files

If the directory is empty, you should use `rmdir`, otherwise, use `rm -r` making sure to use the `-r` switch or else it will *not work*.

```
$ ls -F
dir1/	dir2/
$ rm dir2
rm: cannot remove 'dir2': Is a directory				# no use of '-r'
$ rmdir dir2
rmdir: failed to remove 'dir2': Directory not empty		# must be empty
$ rmdir dir1
$ ls -F
dir2/
$ rm -r dir2
$ ls
```

