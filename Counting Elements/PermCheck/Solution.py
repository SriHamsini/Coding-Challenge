# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(A):
    # Implement your solution here
    N = len(A)
    seen = set()

    for num in A:
        if num > N or num < 1:
            return 0  # If any element is out of the valid range, it's not a permutation

        if num in seen:
            return 0  # If there are duplicate elements, it's not a permutation

        seen.add(num)

    for i in range(1, N + 1):
        if i not in seen:
            return 0  # If any number is missing, it's not a permutation

    return 1
    pass
