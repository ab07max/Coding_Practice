def printSpiral(normalMatrix):
    dummyList = []
    for i in normalMatrix:
        for j in i:
            dummyList.append(j)
    print(dummyList)

    reversedList = dummyList[::-1]
    print(reversedList)

    finalList = []
    for i in range(len(normalMatrix)):
        if i == 0:
            finalList = dummyList
        elif i % 2 == 0:
            finalList = finalList + dummyList[1:]
        else:
            finalList = finalList + reversedList[1:]
    print(finalList)

    lenMatrix = len(normalMatrix)
    i = 0
    while i < len(finalList) and lenMatrix > 0:
        while i + 1 % lenMatrix:
            print(finalList[i])
            i = i + 1
        lenMatrix = lenMatrix - 1
        # lenMatrix = lenMatrix - 1
        # k = 1
        # while k <= lenMatrix:
        #     temp = i + lenMatrix + k
        #     print(finalList[temp])
        #     k = k + 1
        #     i = temp

    # k = 1
    # for j in reversed(range(len(normalMatrix))):
    #     for i in range(j + k):
    #         print(finalList[i])
    #         k = k + 1
        # for i in range(j):
        #     print(finalList[i - ])
        # k = k + 1



if __name__ == '__main__':
    matrix = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
    printSpiral(matrix)

# output -> 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
