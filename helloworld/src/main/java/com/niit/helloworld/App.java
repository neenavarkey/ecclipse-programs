package com.niit.helloworld;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
       // GreetingsImpl greetings=new GreetingsImpl();
       // greeting.setMessage("HELLO WORLD USING SPRING");
      //  System.out.println( "greetings.sayGreetings" );
        ApplicationContext context=new FileSystemXmlApplicationContext("beans.xml");
        
        Greetings greetings=(GreetingsImpl) context.getBean("greetingsObj");
        System.out.println(greetings.sayGreetings());
        
        
        Greetings greetingsCons=(GreetingsImpl) context.getBean("greetingsCons");
        System.out.println(greetingsCons.sayGreetings());
    }
}
