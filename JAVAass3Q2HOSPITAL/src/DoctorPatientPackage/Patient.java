

//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)

package DoctorPatientPackage;
//import javax.swing.JOptionPane;
public class Patient {
	private String name,cnic,address,phoneNo;
	char gender;
	private int age;
	public Patient()
	{
		this.name="XYZ";
		this.cnic="61101-1231123-4";
		this.address=" ";
		this.phoneNo="0333-1234567";
		this.gender='f';
		this.age=15;
	}
	public Patient(String name,String cnic,String address,String phoneNo,char gender,int age)
	{
		this.name=name;
		this.cnic=cnic;
		this.address=address;
		this.phoneNo=phoneNo;
		this.gender=gender;
		this.age=age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCNIC(String cnic)
	{
		this.cnic=cnic;
	}
	public String getCNIC()
	{
		return cnic;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	public String getPhoneNo()
	{
		return phoneNo;
	}
	public void setGender(char gender)
	{
		this.gender=gender;
	}
	public char getGender()
	{
		return gender;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return " Patient name: "+name+"\n Patient CNIC: "+cnic+"\n Patient Address: "+address+"\n Patient Phone Number: "+phoneNo+"\n Patient Gender: "+gender+"\n Patient Age: "+age+"\n";
	}
	public void addPatient( String name, String cnic, String phoneNo, char gender, String address, int age)
	{
	this.name = name;
	this.cnic = cnic;
	this.phoneNo = phoneNo;
	this.gender = gender;
	this.address = address;
	this.age = age;
	}
}
