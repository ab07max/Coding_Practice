class Solution:
    def isPalindrome(self, x: int) -> bool:
        revNumber = str(x)[::-1]
        if(str(x) == revNumber):
            return True
        return False


def main():
    number = 121
    obj = Solution()
    palindrome = obj.isPalindrome(number)
    print(palindrome)


if __name__ == '__main__':
    main()
