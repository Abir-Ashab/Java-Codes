package generics;

class Test<T> {//ekhane "T" deyate kono type casting er proyojon hoynai
    // An object of type T is declared
    T obj;
    Test(T obj) { // constructor
    	this.obj = obj; 
    } 
    
    public T getObject() { //method
    	return this.obj;
    }
    
    public void print()
    {
        System.out.println(obj);
    }
}


//We can also pass multiple Type parameters in Generic classes. 
class Test2<T, U>
{
    T obj1;  // An object of type T
    U obj2;  // An object of type U
 
    // constructor
    Test2(T obj1, U obj2)
    {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
 
    // To print objects of T and U
    public void print()
    {
        System.out.println(obj1);
        System.out.println(obj2);
    }
}


// Driver class to test above
public class basicClassGenerics {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        iObj.print();
 
        // instance of String type
        Test<String> sObj = new Test<String>("GeeksForGeeks");
        sObj.print();
        
        Test2 <String, Integer> obj = new Test2<String, Integer>("GfG", 15);
     
        obj.print();
    }
}
