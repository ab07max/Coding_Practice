#
# Complete the 'pickingNumbers' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY a as parameter.
#

def pickingNumbers(a):
    # Write your code here
    sortA = sorted(set(a))
    max = 0
    for i in range(len(sortA)):
        freq = a.count(sortA[i]) + a.count(sortA[i] + 1)
        if freq > max:
            max = freq
    return max

if __name__ == '__main__':

    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    result = pickingNumbers(a)

    print(result)