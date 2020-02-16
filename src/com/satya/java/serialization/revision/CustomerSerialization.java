package com.satya.java.serialization.revision;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class CustomerSerialization {

	public static void main(String[] args) {
		// create an customer object using 3-arg parametrized constructor
		Customer serializeCustomer = new Customer(102, "NK", "SSN-78087");

		// creating output stream variables
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		// creating input stream variables
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		// creating customer object reference
		// to hold values after de-serialization
		Customer deSerializeCustomer = null;

		try {
			// for writing or saving binary data
			fos = new FileOutputStream("Customer.ser");

			// converting java-object to binary-format
			oos = new ObjectOutputStream(fos);

			// writing or saving customer object's value to stream
			oos.writeObject(serializeCustomer);
			oos.flush();
			oos.close();

			System.out.println("Serialization: " + "Customer object saved to Customer.ser file\n");

			// reading binary data
			fis = new FileInputStream("Customer.ser");

			// converting binary-data to java-object
			ois = new ObjectInputStream(fis);

			// reading object's value and casting to Customer class
			deSerializeCustomer = (Customer) ois.readObject();
			ois.close();

			System.out.println("De-Serialization: Customer object " + "de-serialized from Customer.ser file\n");
		} catch (Exception e) {
			e.printStackTrace();
		}

		// printing customer object to console using toString() method
		System.out.println("Printing customer values from " + "de-serialized object... \n" + deSerializeCustomer);

	}

}

class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	private transient int customerId;
	private String customerName;
	private transient String customerSSN;

	public Customer(int customerId, String customerName, String customerSSN) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSSN = customerSSN;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerSSN() {
		return customerSSN;
	}

	public void setCustomerSSN(String customerSSN) {
		this.customerSSN = customerSSN;
	}

	public void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
		objectOutputStream.defaultWriteObject();
		 
        // temp variable
        int tempCustId = 333 + customerId;
        String tempCustSSN = "Test" + customerSSN;
 
        // saving customer Id and SSN, in encrypted version
        objectOutputStream.writeInt(tempCustId);
        objectOutputStream.writeObject(tempCustSSN);
	}

	public void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
		objectInputStream.defaultReadObject();
		 
        // temp variable
        int tempCustId = objectInputStream.readInt();
        String tempCustSSN = objectInputStream.readObject().toString();
 
        // decrypting and restoring transient variables
        customerId = tempCustId - 333;
        customerSSN = tempCustSSN.substring(4);
	}

	@Override
	public String toString() {
		return "Customer [" + "customerId=" + customerId + ", customerName=" + customerName + ", customerSSN="
				+ customerSSN + "]";
	}
}