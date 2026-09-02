import sys


# This is a simple calculator program that only works for the name braden.
name = input ('what is your name? ')

if name == "braden":
     print("that is a wonderful name!")
     print ("hello " + name)
     how_are_you = input("how are you? ")
     if "good"  in how_are_you:
         print ("that is great!")  
     else:
          print("I am sorry to hear that.")
else:  # this terminates the program if the name is not braden
     print("that is a horrible name!")
     sys.exit()
#if the name is braden the program will continue. 
if name == "braden": 
    I1 = input("input 1: ")    
while I1.isdigit() == False:
     print("please enter valid number")
     I1 = input("input 1: ")
I1 = int(I1)
I2 = input("input 2: ")
while I2.isdigit() == False:
     print("please enter valid number")
     I2 = input("input 2: ")
I2 = int(I2)
Operation = input("operation: ")
while Operation not in ["add", "subtract", "multiply", "divide"]:
     print("please enter valid operation")
     Operation = input("operation: ")
if Operation == "add":
         print(f"the answer is " + str (I1 + I2))
if Operation == "subtract":
         print(f"the answer is " + str (I1 - I2))
if Operation == "multiply":
         print(f"the answer is " + str (I1 * I2))
if Operation == "divide":
         print(f"the answer is " + str (I1 / I2))

print("have a nice day braden")
    