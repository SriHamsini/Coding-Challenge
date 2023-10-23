# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # Implement your solution here
    total_sum = sum(A)
    left_sum = 0
    minimal_difference = float('inf')

    for i in range(len(A) - 1):
        left_sum += A[i]
        right_sum = total_sum - left_sum
        current_difference = abs(left_sum - right_sum)
        minimal_difference = min(minimal_difference, current_difference)

    return minimal_difference
    pass
