package Session_12.thuc_hanh;

import java.util.HashMap;
import java.util.Objects;

public class SxVoiComparableVaComparator  {
    public static class Student implements Comparable <Student> {

        private String name;
        private Integer age;
        private String address;

        public Student(String name, Integer age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Student student) {
            return this.getName().compareTo(student.getName());
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return name.equals(student.name) &&
                    age.equals(student.age) &&
                    address.equals(student.address);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, address);
        }
    }
}
