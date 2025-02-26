### File System Structure
- Unix has a hierarchical file system structure
- It is made up of *directories* (i.e "folders") containing files or more directories called sub-directories
- The top most directory is */*, often called the *root directory*

- When performing commands, it is within a directory located somewhere within the hierarchy (more important when dealing with commands and files)
- A user's "HOME" directory is commonly, `/home/USERNAME`
- Keep in mind, this is NOT UNIVERSAL. For example, CPP Linux has "HOME" at, `/user/USERNAME`
- However, commonly, you can abbreviate your home directory using a tilde, `~`

### External Media
- All devices (HD, CD, DVD, USB, etc) are viewable within the existing directory structure
- This is done via "mount points" and they must be "mounted" to be visible