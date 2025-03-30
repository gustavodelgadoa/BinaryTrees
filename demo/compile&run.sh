#!/bin/bash

echo "Compiling java files..."
javac -d bin ./src/main/examples/*.java  
echo "Compiling complete"

#echo "Executing driver file: int data type"
#java -cp bin main.cs2720.project.BinaryTreeDriver ./src/main/cs2720/project/int-input.txt  
