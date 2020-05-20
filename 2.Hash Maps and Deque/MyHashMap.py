class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next = None
    
    def __init__(self):
        pass


class MyHashMap:
    

    def __init__(self):
        self.capacity = 20
        self.size = 0
        self.map = [Node() for _ in range(self.capacity)]
        # I want to initialize a list which contains 20 None nodes like
        #[None, None, ....]
        

    def put(self, key: int, value: int) -> None:
        index = self.hashIndex(key)
        cur = map[index]

        while cur is not None:
            if cur.key == key:
                cur.value = value
                return None
            else:
                cur = cur.next

        newNode = Node(key, value)
        newNode.next = map[index]
        map[index] = newNode

        return None
        """
        value will always be non-negative.
        """

    def get(self, key: int) -> int:
        index = self.hashIndex(key)
        cur = map[index]

        if cur is None:
            return -1
        else:
            while cur is not None:
                cur.key == key
                cur = cur.next
                return cur.value
            return -1;
        """
        Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
        """

    def remove(self, key: int) -> None:
        index = self.hashIndex(key)
        cur = map[index]
        pre = None

        while cur is not None:
            if cur.key == key:
                if pre is None:
                    map[index] = cur.next
                else:
                    pre.next = cur.next
                self.size -= 1
                return None
            else:
                pre = cur
                cur = cur.next

        return None
        """
        Removes the mapping of the specified value key if this map contains a mapping for the key
        """

    def isEmpty(self):
        return self.size == 0

    def size(self):
        return self.size

    def hashIndex(self, key):
        return key % self.capacity