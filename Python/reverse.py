class Solution:
    def reverse(self, number: int) -> int:
        reversedNumber = ""
        if self.is_int32(abs(number)):
            if (number == 0):
                return 0
            if str(number)[0] == '-':
                reversedNumber = reversedNumber + '-'
                numstr = str(number)[1:]
            else:
                numstr = str(number)
            if numstr[::-1][0] == '0':
                reversedNumber = reversedNumber + numstr[::-1][1:]
            else:
                reversedNumber = reversedNumber + numstr[::-1]
            if self.is_int32(abs(int(reversedNumber))):
                return int(reversedNumber)
            else:
                return 0
        else:
            return 0

    def is_int32(self, number: int) -> bool:
        try:
            if (number < 2 ** 31 - 1):
                return True
            else:
                return False
        except ValueError:
            return False


def main():
    num = 2147483647
    obj = Solution()
    reversedNumber = obj.reverse(num)
    print(reversedNumber)


if __name__ == '__main__':
    main()