package Session_12.thuc_hanh;

import java.util.*;

public class PhanBietHashMapVaHashSet {
    public static class Students implements Comparable <Students>{
        private String name;
        private int age;
        private Boolean gender;

        public Students(String name, int age, Boolean gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public Students() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Boolean getGender() {
            return gender;
        }

        public void setGender(Boolean gender) {
            this.gender = gender;
        }

        @Override
        public int compareTo(Students o) {
            return this.name.compareTo(o.getName());
        }
    }
        public static void main(String[] args) {
            Students students1 = new Students("sang", 24, true);
            Students students2 = new Students("người lạ", 28, false);
            Students students3 = new Students("người lạ 1", 20, null);
            Map<Integer, Students> mapList = new TreeMap<>();
            mapList.put(1, students1);
            mapList.put(2, students2);
            mapList.put(3, students3);
            for (Map.Entry<Integer, Students> studentsEntry : mapList.entrySet()) {
                System.out.println(studentsEntry);
            }
            Set<Students> students=new HashSet<>();
            students.add(students1);
            students.add(students2);
            students.add(students3);
            for (Students students4 : students){
                System.out.println(students4);
            }

        }

    }

