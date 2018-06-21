package com.sample.generics;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InstantiationException, IllegalAccessException
    {
        System.out.println( "Sample............!" );
        
        App a  = new App();
        Sample s = a.get(Sample.class);
        s.setName("Sample");
        System.out.println("Sample Name "+s.getName());
        System.out.println("Sample Done");
        
        Person p = a.get(Person.class);
        p.setName("Person");
        System.out.println("Person Name "+p.getName());
        System.out.println("Person Done");
    }
    
    private <T> T get(Class<T> m) throws InstantiationException, IllegalAccessException
    {
    	return (T) m.newInstance();
    }
    
}
