## vi
`vi` is a text editor found in all versions of Unix, working in one of two modes: [^1]command or [^2]entry mode.

To use `vi`, simply type `vi`, optionally with a name of a file to edit. Like so:
```
$ vi myscript.py
{edit the file}
$
```

If the file does not exist, `vi` will create the file once work is saved

| Hot-Key     | Descriptiojn                           |
| ----------- | -------------------------------------- |
| :w          | Write the file out                     |
| :w filename | Write the file out with given name     |
| :q          | quit vi                                |
| :q!         | quit vi and don't ask to save work     |
| gg          | goto start of file                     |
| GG          | goto end of file                       |
| $           | goto end of line                       |
| ^           | goto start of line                     |
| i           | Enter entry-mode at cursor             |
| a           | Enter entry-mode after cursor          |
| ESC         | Exit entry-mode and enter command-mode |
| k           | Move up one line                       |
| j           | Move down one line                     |
| h           | Move left one char                     |
| l           | Move right one char                    |

## emacs
`emacs` is a text editor not installed by default, however, it is very popular and requested on Linux systems

`emacs` relies HEAVILY on the control and "Meta" key, sometimes the "Meta" key is just ESC and others it is ALT or COMMAND (on Mac).

> [!NOTE] Tip
> If the key combinations use the same 'C' or Meta key, you can keep it held down.
> For example, for C-xC-s, just keep control held down and press x and s.

To use `emacs`, simply type `emacs` followed by the name of the file to edit:
```
$ emacs myscript.py
{edit the file}
```

| Hot-Key | Description         |
| ------- | ------------------- |
| C-xC-s  | Save the file       |
| C-xC-c  | Quit emacs          |
| M-<     | Goto start of file  |
| M->     | Goto end of file    |
| C-a     | Goto start of line  |
| C-e     | Goto end of line    |
| C-p     | Move up one line    |
| C-n     | Move down one line  |
| C-f     | Move right one char |
| C-b     | Move left one char  |

## nano
`nano` is a text editor usually installed by default on Linux, however it is not installed on all *Unixes*. It has slowly been gaining popularity due to its ease of use, but lacks the power `emacs` or `vi` hold.

Much like `emacs` and `vi`, the Control and Meta keys are used quite a bit.

To use `nano`, simply type `nano` optionally followed by the name of the file to edit:
```
$ nano myscript.py
{edit the file}
$
```

| Hot-Key | Description         |
| ------- | ------------------- |
| C-o     | Write out the file  |
| C-x     | Quit nano           |
| M-\     | Goto start of file  |
| C-e     | Goto end of line    |
| C-a     | Goto start of line  |
| C-p     | Move up one line    |
| C-n     | Move down one line  |
| C-f     | Move right one char |
| C-b     | Move left one char  |

[^1]: user provides hot-keys to execute actions, such as search and replace

[^2]: user is entering and editing text

