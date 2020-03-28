/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.node.Node;
import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    Node front, rear;

    public MyCircularQueue() {
        rear = front = null;
    }

    public void insert(Student student) {
        if (student.getAppearing() > 2)
            System.out.println("CANNOT INSERT THIS STUDENT --> " + student.getName());
        else {
            Node n = new Node(student);
            if (front == null) {
                front = n;
            } else
                rear.setNext(n);
            rear = n;
            rear.setNext(front);

        }
    }
}
