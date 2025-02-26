Refer to [[Basic Commands#File Viewing Displaying File Contents|Basic Commands]] for basic file viewing commands

If the file is just a plain text file, we can output the contents using `cat`. The required parameter for `cat` is the name of the file or files to display

```
$ cat file1.txt
Hello File #1
$ cat file2.txt
This is File #2
$ cat file3.txt
Woah! File #3
$ cat file1.txt file2.txt file3.txt
Hello File #1
This is File #2
Woah! File #3
$
```

We can use `-n` with cat to indicate line numbers for each line
```
$ cat -n file1.txt file2.txt file3.txt
1 Hello File #1
2 This is File #2
3 Woah! File #3
$
```

Strange, but sometimes useful, there is a `tac` command that does the same thing as `cat` but displays the file in reverse order.

However, when viewing files, there is often more than one screenful of content in them. To view each screenful, we use a *pager*.

More importantly, we use the *pager*, `less`.
```
$ less filename # ex. usr/share/dict/words
```

To navigate the file using less, we can use:
- _return_ or _cursor-down_ to advance one line
- _cursor-up_ to move up one line
- _space_ or _page-down_ to advance a screenful
- _b_ or _page-up_ to go back up a screenful
- _g_ to go to the top of the file
- _G_ to go to the bottom of the file
- *q* to quit

A powerful feature of less is the ability to search for a substring in the file.
```
$ less filename
/substring{ENTER}
```
Using *n* to cycle through any additional occurrences

```java
public class Java {
	
}
```