# Task4_JavaFileI-O_NotesApp
NotesApp – Java Console File I/O Project
This is a simple console-based Notes Management application built using Core Java. The application allows users to write and read notes using FileWriter and FileReader, demonstrating basic file handling and input/output operations.

✦ Features Implemented

  Write Notes to File: Users can enter multi-line notes that are saved in a text file (notes.txt) using Java's FileWriter.

  Read Notes from File: Notes are displayed line-by-line using BufferedReader, with proper formatting and separation.

  Note Titles: Each note is saved with a user-defined title using the format Title: <Your Title>, making it easy to identify individual notes when reading.

  Multi-line Input with END Trigger: The app supports multi-line note entry, terminated by typing END on a new line.

  File Existence & Empty Check: Before reading, the app checks if the file exists or is empty to prevent runtime errors.

  Data Separation: Each note is separated by ------ in the file for better readability.

✦ Technical Highlights

  StringBuilder Usage: To collect multi-line input efficiently, StringBuilder is used. This avoids repeated string concatenation and improves memory performance.

  Try-with-Resources: Used in file reading for automatic stream closing and cleaner exception handling.

  Clean CLI Design: The application uses a loop-driven menu for smooth user interaction.

✦ How to Use

1. Compile the program: javac NotesApp.java


2. Run it: java NotesApp


3. Choose from:

Option 1 to write a new note with a title

Option 2 to view all saved notes

Option 3 to exit

#This project is ideal for beginners to understand Java File I/O, console interaction, and simple user input handling.
