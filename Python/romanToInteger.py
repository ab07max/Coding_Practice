class Solution:
    def romanToInt(self, s: str) -> int:
        romanDictionary = {
            "M": 1000,
            "D": 500,
            "C": 100,
            "L": 50,
            "X": 10,
            "V": 5,
            "I": 1
        }
        integerValue = 0
        for index in range(len(s)):
            intValue = romanDictionary.get(s[index])
            if index == 0:
                integerValue = intValue
            elif intValue > romanDictionary.get(s[index - 1]):
                integerValue = integerValue + intValue - 2 * romanDictionary.get(s[index - 1])
            else:
                integerValue = integerValue + intValue
        return integerValue


def main():
    romanString = "MCMXCIV"
    obj = Solution()
    integerValue = obj.romanToInt(romanString)
    print(integerValue)


if __name__ == '__main__':
    main()
