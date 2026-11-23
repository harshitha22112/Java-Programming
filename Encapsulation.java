class Student {
    private int age=21;
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.getAge());
    }
    
}
