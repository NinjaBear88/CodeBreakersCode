class ListNode:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.pre = None
        self.next = None


class LRUCache:

    def __init__(self, capacity: int):
        self.dummyHead = ListNode("dummyHead","dummyHead")
        self.dummyTail = ListNode("dummyTail","dummyTail")
        self.dummyHead.next = self.dummyTail
        self.dummyTail.pre = self.dummyHead
        self.capacity = capacity
        self.size = 0
        self.cache = {}
        

    def get(self, key: int) -> int:
        node = self.cache.get(key)
        if node is None:
            return -1
        else:
            self.moveToHead(node)
            return node.value
        

    def put(self, key: int, value: int) -> None:
        node = self.cache.get(key)
        if node is None:
            node = ListNode(key, value)
            self.addNodeHead(node)
            self.cache[key] = node
            self.size += 1
            
            if self.size > self.capacity:
                tailNode = self.removeNode(self.dummyTail.pre)
                self.cache.pop(tailNode.key)
                self.size -=1
        else:
            node.value = value
            self.moveToHead(node)
        
    
    def moveToHead(self, node):
        self.removeNode(node)
        self.addNodeHead(node)
        
    def removeNode(self, node):
        preNode = node.pre
        nextNode = node.next
        
        preNode.next = nextNode
        nextNode.pre = preNode
        
        node.next = None
        node.pre = None
        
        return node
    
    def addNodeHead(self, node):
        node.pre = self.dummyHead
        node.next = self.dummyHead.next
        
        self.dummyHead.next.pre = node
        self.dummyHead.next = node