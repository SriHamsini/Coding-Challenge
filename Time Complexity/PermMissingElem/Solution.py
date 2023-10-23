# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # Implement your solution here
    N = len(A)
    total_sum = (N + 1) * (N + 2) // 2  # Sum of 1 to (N+1) using the formula (n * (n + 1)) / 2

    array_sum = sum(A)

    return total_sum - array_sum
    pass
