# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(N, A):
    # Implement your solution here
    counters = [0] * N
    max_counter = 0
    last_max_counter = 0

    for operation in A:
        if 1 <= operation <= N:
            # Increase counter X
            counter_index = operation - 1
            counters[counter_index] = max(counters[counter_index], last_max_counter) + 1
            max_counter = max(max_counter, counters[counter_index])
        elif operation == N + 1:
            # Set all counters to the maximum value found so far
            last_max_counter = max_counter

    for i in range(N):
        counters[i] = max(counters[i], last_max_counter)

    return counters
    pass
