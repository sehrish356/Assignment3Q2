
//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)

package DoctorPatientPackage;

import javax.swing.JOptionPane;
import DateTimePackage.Date;
import DateTimePackage.Time;

import DateTimePackage.DateTimePackage.Date;
import DateTimePackage.DateTimePackage.Time;

public class OutDoorPatient extends Patient {
		private int fee;
		public Doctor[] doctor;//=new Doctor[3];
		public DateTimePackage.Date date;// =new DateTimePackage.Date();
		public DateTimePackage.Time time;//=new DateTimePackage.Time();
		OutDoorPatient()
		{
			super();
			this.fee=0;
		}
		public OutDoorPatient(int fee,Doctor[] doctor,Date date,Time time,String name,String cnic,String address,String phoneNo,char gender,int age)
		{
			super(name,cnic,address,phoneNo,gender,age);
			this.fee=fee;
			this.doctor=doctor;
			this.date=date;
			this.time=time;
		}
		public OutDoorPatient(int wardNo,int roomNo,int bedNo,int fee,String name,String cnic,String address,String phoneNo,char gender,int age)
		{
			super(name,cnic,address,phoneNo,gender,age);
			this.fee=fee;
		}
		
		public Doctor[] getDoctor()
		{
			return doctor;
		}
		
	    public void setDate(Date date)
		{
		    this.date=date;	
		}
	    public DateTimePackage.Date getDate()
		{
			return date;
		}
	    public void setTime(Time time)
		{
			this.time=time;	
		}
	    public Time getTime()
		{
			return time;
		}
		public String toString()
		{
			return "~~~~~~OUT_DOOR PATIENTS~~~~~~"+"\n OutDoor Patient Fee: "+fee+ "\n Doctor: "+doctor+"\n Time of appointment: "+time+"\n Date of Appointment: \n"+super.toString();
		}
		

		public String appointments(String day,OutDoorPatient j[])
		   {
				   String str="Appointment with patient ";
				   String str1="";
				   String str2="on day:"+day+" .";
			   for(int i=0;i<j.length;i++)
			   {
				   if(j[i]!=null)
				   {
					   if(j[i].date.getDay()==day)
						   str1=str1+str+j[i].getName()+str2+"\n";
					   else
						   str1="";
				   }
			   }
				   if(str1=="")
				  		   str1="No outdoor patient appointments on day:"+day;	 
				    return str1;
		   }
	/*	 public String appointDoctor(String name,OutDoorPatient f[])
		   {
			   String str="Appointment of an outdoor patient ";
			   String str1="";
			   String str2=" with Doctor '"+name+"' .";
		   for(int i=0;i<f.length;i++)
		   {
			   if(f[i]!=null)
			   {
				  if(f[i].doctor.getName().gcompareTo(name) == 0)
					   str1=str1+str+" "+f[i].getName()+str2+"\n";	
				  else
					  str1="";
			   }
		   }
		   if (str1 == "")
				str1 = "No outdoor patient appointment with Doctor '"  + name + "'.\n";
		   return str1;
		   }*/
		 public void dateChanger(OutDoorPatient a)
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
		 public void timeChanger(OutDoorPatient a)
		 {
			 String h,m,p;
				       h=JOptionPane.showInputDialog("Enter new hour:");
					   int hour=Integer.parseInt(h);
					   m=JOptionPane.showInputDialog("Enter new minute:");
					   int minute=Integer.parseInt(m);
					   p =JOptionPane.showInputDialog("Enter new period(AM/PM):");
					   a.time.setHour(hour);
					   a.time.setMinute(minute);
					   a.time.setAmPm(p);
		 }
}
