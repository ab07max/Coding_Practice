# Definition for singly-linked list.
class Node():
    def __init__(self):
        self.data = None
        self.next = None
        self.head = None
    def getNext(self):
        return self.next    
    def lengthOfLL(self):
        currentNode = self.head
        counter = 0
        if currentNode != None:
            if currentNode.getNext() != None:
                while currentNode.getNext() != None:
                    counter += 1
                    self.setNext(self)
            else:
                return 1    
        else:
            return 0
        self.length = counter    
        return self.length        
    def setData(self, data):
        self.data = data    
    def setNext(self, next):
        self.next = next    
    def insertNode(self, data):
        newNode = Node()
        newNode.setData(data)
        if self.lengthOfLL() == 0:
            self.head = newNode
            newNode.setNext(None)
        else:
            currentNode = self.head
            while currentNode.getNext() != None:
                currentNode = currentNode.getNext()
            currentNode.setNext(newNode)
            newNode.setNext(None)
            #self.length += 1
    def displayContents(self):
        currentNode = self.head
        print currentNode.data
        while currentNode.getNext() != None:
            currentNode = currentNode.getNext()
            print currentNode.data    

ll1 = Node()
ll1.insertNode(2)
ll1.insertNode(4)
# ll1.insertNode(8)
ll1.displayContents()

# class Solution(object):
#     def addTwoNumbers(self, l1, l2):
#         """
#         :type l1: ListNode
#         :type l2: ListNode
#         :rtype: ListNode
#         """

