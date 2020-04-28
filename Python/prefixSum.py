def strangeSort(mapping, nums):
    maps = {}
    resultList = {}
    for i in range(len(mapping)):
        maps[mapping[i]] = i
    for j in nums:
        strNum = ""
        for k in j:
            strNum = strNum + str(maps[int(k)])
        resultList[j] = strNum
    result1 = sorted(resultList.items(), key=lambda item: int(item[1]))
    return result1


if __name__ == '__main__':
    mapping_count = int(input().strip())

    mapping = []
    resultList = []

    for _ in range(mapping_count):
        mapping_item = int(input().strip())
        mapping.append(mapping_item)

    nums_count = int(input().strip())

    nums = []

    for _ in range(nums_count):
        nums_item = input()
        nums.append(nums_item)

    result = strangeSort(mapping, nums)
    for i in result:
        resultList.append(i[0])

    for i in resultList:
        print(i)