package _05Collection._00List;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("张三");
        names.add("王五");
        names.add("赵六");

        names.add(1,"李四");
        System.out.println(names);

        names.remove(1);
        System.out.println(names);

        names.set(0,"张三丰");

        //ArrayList add源码
/*
        public boolean add(E e) {
            modCount++;
            add(e, elementData, size);
            return true;
        }

        private void add(E e, Object[] elementData, int s) {
            if (s == elementData.length)
                elementData = grow();
            elementData[s] = e;
            size = s + 1;
        }

        private Object[] grow() {
            return grow(minCapacity: size + 1);
        }

        private Object[] grow(int minCapacity) {
            int oldCapacity = elementData.length;
            if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
                int newCapacity = ArraysSupport.newLength(oldCapacity,minCapacity - oldCapacity, oldCapacity >> 1 );
                return elementData = Arrays.copyOf(elementData, newCapacity);
            }
            else {
                return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
            }
        }
*/
    }
}
