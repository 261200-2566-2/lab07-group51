public class lab07 {
    public static void main(String[] args) {
        Main.MyHashSet<String> mySet = new Main.MyHashSet<>();

        // เพิ่มสมาชิก
        mySet.add("a");
        mySet.add("b");
        mySet.add("c");

        // เช็คว่า a,b,c,d เป็นสมาชิกหรือไม่
        System.out.println("Does mySet contain 'a'? " + mySet.contains("a"));
        System.out.println("Does mySet contain 'b'? " + mySet.contains("b"));
        System.out.println("Does mySet contain 'c'? " + mySet.contains("c"));
        System.out.println("Does mySet contain 'd'? " + mySet.contains("d"));
        System.out.println("The size of mySet is: " + mySet.size());

        //เช็คว่าถ้าเราเพิ่ม b เข้าไปอีกรอบจะไม่เกิดการเพิ่มสมาชิกตัวใหม่เข้าไป
        mySet.add("b");

        //เช็ค size
        System.out.println("The size of mySet is: " + mySet.size());

        // ลบสมาชิก
        mySet.remove("a");

        //เช็ค size
        System.out.println("The size of mySet is: " + mySet.size());


        //เช็คว่าเป็น set ว่างไหม
        System.out.println("Is mySet empty? " + mySet.isEmpty());

        //ลบสมาชิกทุกตัวออกจาก set
        mySet.clear();

        //เช็คว่าเป็น set ว่างไหม
        System.out.println("Is mySet empty? " + mySet.isEmpty());

    }
}
