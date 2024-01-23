
def can_color_array_two_colors(n, arr):
    total_sum = sum(arr)
    sub_array_sum = 0
 
    for i in range(n):
        sub_array_sum += arr[i]
        remaining_sum = total_sum - sub_array_sum
        if sub_array_sum % 2 == remaining_sum % 2:
            return "YES"
 
    return "NO"
 
 
 
 
 
t = int(input())  
for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))  
 
    print(can_color_array_two_colors(n, arr))