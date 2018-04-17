package bufferbuilder;

public class Stringrelated {
	
	public static void main(String args[])

	{
		//inefficient
 String info = " ";
 info +=  "MY NAME IS PREETHAM ";
 info += "";
 info +="I am  a programmer";
System.out.println(info);
//

StringBuilder sb= new StringBuilder();
sb.append("My name is robert.  I am a writer");
sb.append(" ");
sb.append("I am also editor");
System.out.println(sb.toString());
StringBuilder s= new StringBuilder();
s.append("Hello there");
s.append(" ");
s.append("hi wts ups");
System.out.println(s.toString());

//// formatting
System.out.println("Here is some text.\tThat was a tab.\nTHat was new line");
System.out.printf("Total cost %-10d ; quantity %d", 5,120);

// formatting integers
for(int i=0;i<=20;i++)
{
System.out.printf("%2d; %s\n",i, "here is some text");	
}

// formatting floats
	System.out.printf("Total value: %5.2f\n",3226.79886);
	System.out.printf("Total value: %1.2f\n",6.7898);

}
	
	
	
	}
