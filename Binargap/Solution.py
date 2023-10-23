# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

def solution(N):
    # Implement your solution here
    binary_str = bin(N)[2:]  # Convert N to binary and remove '0b' prefix
    max_gap = 0  # Initialize the maximum binary gap length
    current_gap = 0  # Initialize the current binary gap length

    for char in binary_str:
        if char == '1':
            max_gap = max(max_gap, current_gap)  # Update max_gap if needed
            current_gap = 0  # Reset the current gap
        else:
            current_gap += 1  # Increment the current gap

    return max_gap
    pass