# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # Implement your solution here
    result = 0
    
    for element in A:
        result ^= element
        
    return result
    pass
