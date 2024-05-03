package ch10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _12_SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		_12_Person personAhn = new _12_Person("안재용", "대표이사");
		_12_Person personKim = new _12_Person("김철수", "상무이사");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personAhn);
			oos.writeObject(personKim);
		} catch(IOException e) {
			e.printStackTrace();
		}
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			_12_Person p1 = (_12_Person)ois.readObject();
			_12_Person p2 = (_12_Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
