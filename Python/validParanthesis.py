class validParanthesis:
    def isValid(self, s: str) -> bool:
        top = -1
        stack = []
        for ch in s:
            if top == -1:
                top = top + 1
                stack.append(ch)
            elif (stack[top] == '(' and ch == ')') or (stack[top] == '[' and ch == ']') \
                    or (stack[top] == '{' and ch == '}'):
                del stack[top]
                top = top - 1
            else:
                top = top + 1
                stack.append(ch)
        if top == -1:
            return True
        else:
            return False


if __name__ == '__main__':
    obj = validParanthesis()
    bool_value = obj.isValid("()[]{")
    print(bool_value)