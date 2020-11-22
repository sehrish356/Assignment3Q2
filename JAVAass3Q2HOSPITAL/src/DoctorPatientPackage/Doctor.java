

//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)

package DoctorPatientPackage;
import javax.swing.JOptionPane;
public class Doctor {
	private String name, department, specialization;
	private String cnic, phoneNo;
	private char gender;
	Doctor()
	{
		this.name=" ";
		this.department=" ";
		this.specialization=" ";
		this.cnic="123456789";
		this.phoneNo="123456789";
		this.gender=' ';
	}
	public Doctor(String name,String cnic, String phoneNo,char gender,String department,String specialization)
	{
		this.name=name;
		this.cnic=cnic;
		this.phoneNo=phoneNo;
		if(gender=='f'|| gender=='m')
		{
			this.gender=gender;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You can't enter gender other than m or f ","Error",JOptionPane.WARNING_MESSAGE);
		}
		this.department=department;
		this.specialization=specialization;
	}
	public void setCNIC(String cnic)
	{
		this.cnic=cnic;
	}
	public String getCNIC()
	{
		return cnic;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setphoneNO(String phoneNo)
	{
		this.phoneNo=phoneNo;
	}
	public String getphoneNo()
	{
		return phoneNo;
	}
	public void setGender(char gender)
	{
		if(gender=='f'|| gender=='m')
		{
			this.gender=gender;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "You can't enter gender other than m or f ","Error",JOptionPane.WARNING_MESSAGE);
		}
	}
	public char getGender()
	{
		return gender;
	}
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDspecialization(String specialization)
	{
		this.specialization=specialization;
	}
	public String getSpecialization()
	{
		return specialization;
	}
	public String toString()
	{
	//	System.out.println("DOCTOR'S DETAILED INFO: ");
		return " Doctor Name: "+name+"\n CNIC: "+"\n Phone Number: "+phoneNo+"\n Gender: ("+gender+")\n Department: "+department+"\n Specialization: "+specialization+"\n";
	}
	public boolean searchName(String name,Doctor d[])
	 {
		for(int i=0;i<d.length;i++)
		{
			if(d[i]!=null)
			{
				if(d[i].getName().compareTo(name)==0)
					return true;
			}
		}
		return false;
	 }
	public boolean searchDepartment(String dep,Doctor d[])
	{
	     for(int i=0;i<d.length;i++)
	      {
		    if(d[i]!=null)
		     {
			  if(d[i].getDepartment().compareTo(dep)==0)
				return true;
		     }        
	      }		
	     return false;
	}
	public void displayDoc(Doctor d[])
	{
		//it will display list of all the available doctors
		String str="";
		   String str2="Doctor ";
		for(int i=0;i<d.length;i++)
		{
				if(d[i]!=null)
					str=str+str2+(i+1)+" name is:  "+d[i].getName()+"\n";
				else
					str=str+"";
		    
		}
		JOptionPane.showInternalMessageDialog(null,"LIST OF ALL DOCTORS: \n"+str);
	}


}
