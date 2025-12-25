📁 File_Handling

This folder contains C programs that demonstrate fundamental file handling operations using system calls. Each program showcases how to work with files at a low level, including creating, reading, writing, seeking, and deleting files.

## Programs Included

### ✅ Create a File
- **Functionality:** Creates a new file using `creat()` or `open()` with `O_CREAT` flag.

### ✅ Open a File
- **Functionality:** Opens an existing file using `open()` for reading or writing.

### ✅ Read from a File
- **Functionality:** Reads data from a file using `read()` system call.

### ✅ Write to a File
- **Functionality:** Writes data into a file using `write()` system call.

### ✅ Seek in a File
- **Functionality:** Changes the file offset using `lseek()` to read or write from a specific location in the file.

### ✅ Close a File
- **Functionality:** Closes the opened file using `close()` to release file descriptor.

### ✅ Delete a File
- **Functionality:** Removes a file from the file system using `unlink()`.

## Notes
- All programs use standard Unix/Linux system calls.
- Make sure to compile with `gcc filename.c -o outputfile` and run with `./outputfile`.
- These programs are designed for educational purposes to understand basic file handling at the system call level.

