public class Conditions {
    public static void main(String[] args) {
        char num1 = '5';
        if (num1 >= 0 && num1<=9)
        { System.out.println("true");
        }
    else {
            System.out.println("false");
        }//1 задание
int age = 18;
    if (age >= 18){
        System.out.println("You are an adult");
    }// 2 задание

int n1 = -5;
    if (n1<0){
        System.out.println("negative number");
    }
    else if
    (n1==0){
        System.out.println(" number is zero");
    }
    else
    {
        System.out.println("positive number");
    }//3 задание


int n2,n3,sum;
    n2=5;
    n3=7;
    sum = n2+n3;
    if (sum >=0&& sum <=10) {
        System.out.println("0-10");
    }
    else if
    (sum>=11 && sum <=20){
        System.out.println("11-20");
    }
    else if
    (sum>=21 && sum <=30){
        System.out.println("21-30");
    }
    else {
        System.out.println("none of the above");
    }//4 задание
    char weekDayNumber = '2';
    switch (weekDayNumber) {
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednesday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        default -> System.out.println("wrong weekday number");
    }
    //5 задание
         int f = 5;
    int r = 6;
    String operation = "-";
    switch (operation){
    case"+"->System.out.println(f+r);
    case"-"->System.out.println(f-r);
    case"*"->System.out.println(f*r);
    case"/"->System.out.println(f/r);
    case"%"->System.out.println(f%r);
    }//6 задание

    int w =6;
    int q = -9;
    if ( w <0 && q <0){
        System.out.println("negative");
    }
        else if ( w >0 && q >0){
            System.out.println("both are positive");
        }
        else if ( w >0 && q <0){
            System.out.println("1st is positive,2nd is negative");
        }
    else if ( w <0 && q >0){
        System.out.println("1st is negative,2nd is positive");
    }
    else {
        System.out.println("one of the numbers is 0");
    }//7 задание

String str1 = "first";
    String str2 = "second";
    String together1 = str1+str2;//задание строки 1

        String str3 = "bob";
        String str4 = "rob";
        String together2 = str3+ " "+ str4;//задание строки 2

        int x = 7;
        String together3 = x+"";
System.out.println(together3);

String str5 = "Mob";
String str6 = "Mob1";
if (str5.equals(str6))
    System.out.println("равны");
else
    System.out.println("неравны");//задание строки 3
    }
}

