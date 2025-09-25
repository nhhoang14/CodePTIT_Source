# https://code.ptit.edu.vn/student/question/PYKT071
# SỐ KHÔNG GIẢM TRONG FILE NHỊ PHÂN

import struct
from io import BytesIO
from collections import defaultdict

def is_non_decreasing(x):
    if x < 10: return False
    last = x % 10
    x //= 10
    while x:
        d = x % 10
        if d > last: return False
        last = d
        x //= 10
    return True

class JavaArrayListFast:
    def __init__(self, filename):
        with open(filename, "rb") as f:
            self.data = BytesIO(f.read())
        self.data.read(4)
        self.refs = []
        self.counts = defaultdict(int)
        self.read_object()

    def _read(self, fmt):
        size = struct.calcsize(fmt)
        val = struct.unpack(fmt, self.data.read(size))[0]
        return val

    def read_string(self):
        length = self._read(">H")
        s = self.data.read(length).decode()
        return s

    def read_object(self):
        op = self._read(">B")
        if op == 0x70:  # NULL
            return None
        elif op == 0x71:  # REFERENCE
            handle = self._read(">L")
            return self.refs[handle - 0x7E0000]
        elif op == 0x72:  # CLASSDESC
            name = self.read_string()
            self._read(">qB")
            nprops = self._read(">H")
            for _ in range(nprops):
                self._read(">B")
                self.read_string()
            self._read(">B")
            self.read_object()
            self.refs.append(name)
            return name
        elif op == 0x73:  # OBJECT
            cls = self.read_object()
            if cls == "java.util.ArrayList":
                size = self.read_value()
                self.read_object()  # blockdata
                self.refs.append(None)  # placeholder
                for _ in range(size):
                    val = self.read_object()
                    if is_non_decreasing(val):
                        self.counts[val] += 1
                return None
            else:
                val = self.read_value()
                self.refs.append(val)
                return val
        elif op == 0x77:  # BLOCKDATA
            length = self._read(">B")
            self.data.read(length)
            return None
        else:
            return self.read_value()

    def read_value(self):
        return self._read(">i")

# đọc file
obj1 = JavaArrayListFast("DATA1.in")
obj2 = JavaArrayListFast("DATA2.in")

common = sorted(set(obj1.counts) & set(obj2.counts))
for x in common:
    print(x, obj1.counts[x], obj2.counts[x])
