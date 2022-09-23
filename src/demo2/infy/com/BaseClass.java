package demo2.infy.com;

public class BaseClass {
	

        private int display1(int i)

{        return i++ + --i;    }

public int display2(int i)

{        return display1(--i + 1);    }

}

class ChildClass extends BaseClass

{

        int display1(int i) // Line1

{        return display2(++i + ++i + --i); // Line2    }

}

class MainClass {

        public static void main(String[] args) {

                         System.out.println("Value is " + new ChildClass().display1(27));

        }}
}
