Unix has been around for a long time, prior to the graphical user interface (GUI). The command line interface (CLI) is what Unix is most known for. Rather than point and click, commands are used to instruct the computer what to do.

### Shell
The terminal provides a [^1]*shell*. A shell comes in many forms, such as:
- sh: Bourne shell, original
- csh: C-shell, additional features for C programmers
- tcsh: Tom's C-shell - improvement on C-shell
- bash: Bourne-Again shell - Linux default and old MacOS default
- zsh: Z Shell (bash extension) - new MacOS default
- cmd: command prompt - Windows default
For CS 2600, the class focuses on the *bash* shell

### Modern Reality
What we call a *terminal* in reality is a *terminal emulator*. Before, terminals were just monitors and keyboards that communicated with a back room server.

These devices were called *dumb terminals*, as it had no capacity to compute anything other than take input, send it, receive a response, and display the response.

### Components of a Shell
**The Prompt**
- Upon opening a shell for the first time, the user is presented with a prompt.
- For now, just know the prompt ends in a dollar sign, indicating that the shell program is awaiting your input

**Commands and Command Lines**
- On any operating system, commands and command lines have two parts: [^2]the command and [^3]the command parameters.
- For example, this is a simple command with no associated input that simply displays the system date and time

```
$ date
Sat 23 Jan 2021 07:46:23 PM PST
```

- However, this isn't always the case as stated before, most commands take additional information, aka *the command parameters*

```
$ echo hello
hello
$
```

- Here, `hello` is the command line parameter given to the command, `echo`, to work on
- Command parameters can be many different things, such as

```
$ echo // nothing

$ echo hello // words, called 'arguments'
hello
$ echo - n // switches
$echo -n "Hello World" // switches and arguments
Hello World$
$ echo -n -e "Hello\nWorld\n" // often several combinations
Hello
World
$
```


[^1]: a command interface which uses words and symbols to communicate work for the computer to perform

[^2]: a shell keyword or program name

[^3]: data passed to the command via the input line at execution
