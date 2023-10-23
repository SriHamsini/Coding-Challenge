# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # Implement your solution here
    # Create a set to store positive integers
    positive_integers = set()
    
    # Iterate through the array and add positive integers to the set
    for num in A:
        if num > 0:
            positive_integers.add(num)
    
    # Find the smallest positive integer not in the set
    smallest_positive = 1
    while smallest_positive in positive_integers:
        smallest_positive += 1
    
    return smallest_positive
    pass
