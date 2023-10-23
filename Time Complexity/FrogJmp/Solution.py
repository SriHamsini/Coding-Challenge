# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(X, Y, D):
    # Implement your solution here
    number_of_jumps = (Y - X + D - 1) // D
    return number_of_jumps
    pass