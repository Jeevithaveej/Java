package filee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deser
{
	

	public static void main(String[] args)throws Exception
	{
		FileInputStream fi=new FileInputStream("jeevi.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Stud st=(Stud)oi.readObject();
		System.out.println(st.getEmpNo());
		System.out.println(st.getName());
		System.out.println(st.getAddress());
		System.out.println(st.getGlbId());
		fi.close();
		oi.close();
	}

}

