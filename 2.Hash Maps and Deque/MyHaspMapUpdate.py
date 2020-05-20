class Node:
    def __init__(self, key, value):
        self.key = key
        self.value = value
        self.next = None

    # debugging
    def __str__(self):
        return "[key:{} | val:{}]->".format(self.key, self.value) + str(
            self.next) if self.next else "[key:{} | val:{}]->NULL".format(self.key, self.value)


class MyHashMap:
    def __init__(self):
        self.capacity = 20
        self.size = 0
        self.map = [Node("dummy", "dummy") for _ in range(self.capacity)]

    # forgot to update self.size
    def put(self, key: int, value: int):
        index = self.hashIndex(key)
        cur = self.map[index]

        # we are using a dummy node so we dont want to look at the first element
        while cur.next is not None:
            cur = cur.next
            if cur.key == key:
                cur.value = value
                return

        newNode = Node(key, value)
        newNode.next = self.map[index].next
        self.map[index].next = newNode
        self.size += 1

        return

    def get(self, key: int) -> int:
        index = self.hashIndex(key)
        cur = self.map[index]

        # we are using a dummy node so we dont want to look at the first element
        while cur.next is not None:
            cur = cur.next
            if cur.key == key:
                return cur.value

        return -1

    # forgot to update self.size
    def remove(self, key: int) -> None:
        index = self.hashIndex(key)
        cur = self.map[index]
        pre = None

        # we are using a dummy node so we dont want to look at the first element
        while cur.next is not None:
            pre = cur
            cur = cur.next
            if cur.key == key:
                pre.next = cur.next
                self.size -= 1

                return

        return

    def isEmpty(self):
        return self.size == 0

    def hashIndex(self, key):
        return hash(key) % self.capacity

    # debugging
    def __str__(self):
        str = ""
        for i in range(self.capacity):
            str += "{} : {}".format(i, self.map[i]) + "\n"
        return str


test = MyHashMap()
print(test)
test.put(1, 2)
test.put(2, 4)
test.put(6, 7)
print(test)
print(test.get(1))
test.remove(1)
print(test)
