import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class serial {  
    public static void main(String args[]) throws IOException,ClassNotFoundException
    {
    graph obj=new graph();
    obj.a=4;
    obj.b=2;
    obj.c=3;
    File f=new File("obj.txt");//serializing an array
         FileOutputStream fos=new FileOutputStream(f);
         ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(obj);
         oos.close();
         fos.close();
         System.out.println("Object has been serialized"+"\n\n");
        graph obj2=null;
    File f2=new File("obj.txt");//deserializing an array
    FileInputStream fin=new FileInputStream(f2);
    ObjectInputStream oin=new ObjectInputStream(fin);
     obj2=(graph) oin.readObject();
    System.out.println("Object has been deserialized"+"\n\n");
    System.out.println("Value of object is"+obj2.a);
         System.out.println("Value of object is"+obj2.b);
         System.out.println("Value of object is"+obj2.c);
    }
    
    
}
class graph implements Serializable
        
{
    int arr[][]=new int[5][5];
    int a=arr[1][4];
    int b=arr[2][3];
    int c=arr[3][4];
}





