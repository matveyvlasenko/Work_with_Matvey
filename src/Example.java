public class Example {

        private String name;
        private int age;

        public Example(String name, int age) {
            this.name = name;

            if (age >= 0) {
                this.age = age;
            }
        }

        public void setAge(int age){
            if(age >= 0){
                this.age = age;
            }
        }
        public int getAge(){
            return age;
        }
    }

    class Main76 {
        public static void main(String[] args) {
            Person p = new Person("Mike", 20);

            int previousAge = p.getAge();
            System.out.println(previousAge);


            int personAge = p.getAge();
            System.out.println(personAge);
        }
    }


