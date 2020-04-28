class longestCommonPrefix:
    def longestCommonPrefix(self, strs) -> str:
        maxCharacterMatching  = ""
        dup = []
        for s in strs:
            if s != strs[0]:
                dup.append(s)
        for i in range(len(strs[0])):
            count = 0
            for j in dup:
                if len(strs[0]) == 1:
                    a = strs[0]
                else:
                    a = strs[0][:i]
                if a == j[:i]:
                    count = count + 1
                if count == len(dup):
                    maxCharacterMatching = j[:i]
        return maxCharacterMatching

if __name__ == '__main__':
    wordList = ['flower','flow','flight']
    obj = longestCommonPrefix()
    maxCharacters = obj.longestCommonPrefix(wordList)
    print(maxCharacters)