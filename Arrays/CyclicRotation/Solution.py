# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A, K):
    # Implement your solution here
    N = len(A)
    
    if N == 0:
        return A  # No need to rotate an empty array
    
    K = K % N  # Normalize K to be within the range [0, N]
    
    if K == 0:
        return A  # No rotation needed
    
    rotated_A = A[-K:] + A[:-K]  # Slicing to create the rotated array
    
    return rotated_A