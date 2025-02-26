[^1]`tmux` is a tool for generating several [^2]*windows* and *panes* when working in a text-only environment.

Since a GUI will not be used in CS 2600, terminal screen multiplexers will be extremely helpful.

To use `tmux`, simply just launch it as so:
```
$ tmux
```
Which will then prompt a green status bar at the bottom of the terminal screen, providing:
- The session number
- Window numbers
- Window names
- Current window
- Host name
- Current military time
- Current date

#### The Meta Key
We need to type stuff inside of our command shell while also having the ability to communicate with `tmux`. That is where the hot-key, or Meta-Key, *control-b* comes into play.

When using *control-b*, any hot-keys or commands we use will be issued to `tmux`.

#### Default Hot-Keys

| Key                  | Action                                               |
| -------------------- | ---------------------------------------------------- |
| c                    | Create a new window                                  |
| '                    | Rename the current window                            |
| "                    | Split the current pane horizontally (top and bottom) |
| %                    | Split the current pane vertically (left and right)   |
| t                    | Show a clock                                         |
| :                    | Issue a long, typed command to tmux                  |
| o                    | Move the cursor to another paneq                     |
| q                    | Show pane ID numbers                                 |
| ?                    | Display the help                                     |
| 0-9                  | Change to window 0-9                                 |
| d                    | Detach from current `tmux` session                   |
| C-UP/DOWN/LEFT/RIGHT | Resize the pane                                      |
| [                    | Copy/scroll mode                                     |

#### Sessions
You can have multiple `tmux` sessions once you detach, but you can always re-attach to an existing session or launch a new session
```
$ tmux # launch session 0
$ {META-d} # detach
$ tmux # launch session 1
$ {META-d} # detach
$ # etc...
$ tmux attach -t 0
```

We can list out the sessions using `tmux ls`
```
instructor@deb12vm:~$ tmux ls
0: 1 windows (created Sun Sep  8 19:43:49 2024) (attached)
2: 1 windows (created Sun Sep  8 19:53:47 2024)
instructor@deb12vm:~$
```

**HEAVILY AVOID** nesting `tmux` sessions by making sure you are attaching while already in a `tmux` session
[^1]: Terminal Multiplexer

[^2]: separate terminal screens/windows
	
