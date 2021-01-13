package bai_8.thuc_hanh;

import java.util.Arrays;

public class TrienKhaiListDonGian {
    public static class Mylist<E> {
        private int size = 0;
        private static final int defaultCapacity = 10;
        private Object[] arr;

        public Mylist() {
            arr = new Object[defaultCapacity];
        }

        private void ensureCapa() {
            int newsize = arr.length * 2;
            arr = Arrays.copyOf(arr, newsize);
        }

        private void add(E e) {
            if (size == arr.length) {
                ensureCapa();
            }
            arr[size++] = e;
        }

        public E get(int i) {
            if (i >= size || i < 0) {
                throw new IndexOutOfBoundsException("Index :" + i + ",Size" + i);
            }
            return (E) arr[i];
        }

        public static void main(String[] args) {
            Mylist<Integer> listInteger = new Mylist<Integer>();
            listInteger.add(1);
            listInteger.add(2);
            listInteger.add(3);
            listInteger.add(4);
            listInteger.add(5);
            listInteger.add(6);
            System.out.println("element 4 :" + listInteger.get(4));
            System.out.println(listInteger.get(-1));
        }

    }
}
