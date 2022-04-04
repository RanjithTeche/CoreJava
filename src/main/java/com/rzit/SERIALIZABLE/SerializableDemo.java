package com.rzit.SERIALIZABLE;

import java.io.*;

/**
 * Created by Ranjith on 7/17/2017.
 */
public class SerializableDemo {
    public static void main(String[] args) {
        CCard p = new CCard();
        p.setId(1);
        p.setcName("Dinner");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("a.txt")));
            objectOutputStream.writeObject(p);

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("a.txt")));
            try {
                CCard obj =  (CCard)objectInputStream.readObject();
                System.out.println(obj);
                System.out.println(obj.getId() +" \t "+obj.getcName());
                /**
                 * so here parent is not Serializable thats why it prints o 
                 * com.rzit.SERIALIZABLE.CCard@41629346
				 *	0 	 Dinner
                 */
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
