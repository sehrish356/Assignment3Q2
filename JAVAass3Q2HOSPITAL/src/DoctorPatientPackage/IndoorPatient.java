
//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)

package DoctorPatientPackage;
import javax.swing.JOptionPane;
import DateTimePackage.Date;
import DateTimePackage.Time;

import DateTimePackage.DateTimePackage.Date;
import DateTimePackage.DateTimePackage.Time;
public class IndoorPatient extends Patient {
	private int wardNo,roomNo,bedNo,fee;
	Doctor[] doctor=new Doctor[3];
	Date date =new Date();
	Time time=new Time();
	IndoorPatient()
	{
		super();
		this.wardNo=0;
		this.roomNo=0;
		this.bedNo=0;
		this.fee=0;
	}
	IndoorPatient(int wardNo,int roomNo,int bedNo,int fee,Doctor[] doctor,String name,String cnic,String address,String phoneNo,char gender,int age)
	{
		super(name,cnic,address,phoneNo,gender,age);
		this.wardNo=wardNo;
		this.roomNo=roomNo;
		this.bedNo=bedNo;
		this.fee=fee;
		this.doctor=doctor;
	}
	IndoorPatient(int wardNo,int roomNo,int bedNo,int fee,String name,String cnic,String address,String phoneNo,char gender,int age)
	{
		super(name,cnic,address,phoneNo,gender,age);
		this.wardNo=wardNo;
		this.roomNo=roomNo;
		this.bedNo=bedNo;
		this.fee=fee;

	}
	void setWardNo(int wardNo)
	{
		this.wardNo=wardNo;
	}
	int getWardNo()
	{
		return wardNo;
	}
	void setRoomNo(int roomNo)
	{
		this.roomNo=roomNo;
	}
	int getRoomNo()
	{
		return roomNo;
	}
	void setBedNo(int bedNo)
	{
		this.bedNo=bedNo;
	}
	int getBedNo()
	{
		return bedNo;
	}
	void setDoctor(Doctor[] doctor)
	{
		this.doctor=doctor;
	}
	Doctor[] getDoctor()
	{
		return doctor;
	}
	public void setDoctor(String name,String cnic, String phoneNo,char gender,String department,String specialization)
	{
		String a=JOptionPane.showInputDialog(null, "How many doctors are dealing with this patient");
		int n=Integer.parseInt(a);
		for(int i=0;i<n;i++)
		{
			doctor[i].setName(name);
			doctor[i].setCNIC(cnic);
			doctor[i].setphoneNO(phoneNo);
			doctor[i].setGender(gender);
			doctor[i].setDepartment(department);
			doctor[i].setDspecialization(specialization);
		}
	}
	public String toString()
	{
		return "~~~~~~~~~~~INDOOR PATIENTS~~~~~~~~~~~"+"\n Ward Number: "+wardNo+ "\n Room Number: "+roomNo+"\n Bed Number: "+bedNo+"\n Patient Fee: "+fee+"\n Doctor: "+getDoctor()+"\n"+super.toString();
	}
	
	 public void displayIP(IndoorPatient d[])
	   {
		   String str="";
		   String str2="Indoor Patient ";
	   	for(int i=0;i<d.length;i++)
	   	{
	   		if(d[i]!=null)
	   		str=str+str2+(i+1)+":  "+d[i].getName()+"\n";
	   	}
	   	
	   		JOptionPane.showMessageDialog(null,"" +str,"INDOOR PATIENT NAMES",JOptionPane.WARNING_MESSAGE);
	   }
	   public String appointments(String day,IndoorPatient d[])
	   {
			   String str="Appointment of patient ";
			   String str1="";
			   String str2=" on day:"+day+" .";
		   for(int i=0;i<d.length;i++)
		   {
			   if(d[i]!=null)
			   {
				   if(d[i].date.getDay()==day)
					   str1=str1+str+" "+d[i].getName()+str2+"\n";
				   else
					   str1="";
			   }
		   }
			   if(str1=="")
			      str1="There is No indoor patient appointments on this day:"+day;	 
		   return str1;
	   }

	/*	public String appointDoctor(String name, IndoorPatient f[]) {
			Doctor doc=new Doctor();
			String str = "Appointment of an indoor patient ";
			String str1 = "";
			String str2 = " with Doctor '" + name +"'.";
			for (int i = 0; i < f.length; i++) {
				if (f[i] != null) {
					if (f[i].doctor.getName().compareTo(name) == 0)
						str1 = str1 + str + str2 + "\n";
					else
						str1 = "";
				}
			}
			if (str1 == "")
				str1 = "No indoor patient appointment with Doctor '" + name + "'.\n";
			return str1;
		}*/
	   public void dateChanger(IndoorPatient a)
	   {
		   String l;
			      l=JOptionPane.showInputDialog("Give new day:");
				   l=JOptionPane.showInputDialog("Give new month:");
				   int month=Integer.parseInt(l);
				   l =JOptionPane.showInputDialog("Give new year:");
				   int year=Integer.parseInt(l);
				   a.date.setDay(l);
				   a.date.setMonth(month);
				   a.date.setYear(year);
			
			       }

	public void displayDate()
	{
		JOptionPane.showMessageDialog(null,date.getDay()+"-"+date.getMonth()+"-"+date.getYear(),"DATE",JOptionPane.WARNING_MESSAGE);
	}
	public String getDate()
	 {
		 String str;
		 str=date.getDay()+"/"+date.getMonth()+"/"+date.getYear()+"\n";
		 return str;
	 }
	public Date getDDate()
{
	return date;
}
  public void setDate(Date date)
  {
	   this.date=date;	

  }
  public void setFee(int fee)
	{
		this.fee=fee;
	}
}
