# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(X, A):
    # Implement your solution here
    covered_positions = set()
    
    for time, position in enumerate(A):
        covered_positions.add(position)
        
        if len(covered_positions) == X:
            return time
    
    return -1
    pass
