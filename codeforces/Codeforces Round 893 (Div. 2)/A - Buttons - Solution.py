def determine_winner(a, b, c):
    # If c is odd and a >= b, Anna will win because she can press the last button.
    if c % 2 == 1 and a >= b:
        return "First"
    
    # If c is even and a > b, Anna will win by pressing all her buttons first.
    if c % 2 == 0 and a > b:
        return "First"
    
    # If c is even and b >= a, Katie will win by pressing all her buttons first.
    return "Second"
 
# Read the number of test cases
t = int(input())
 
# Iterate over each test case
for _ in range(t):
    a, b, c = map(int, input().split())
    winner = determine_winner(a, b, c)
    print(winner)