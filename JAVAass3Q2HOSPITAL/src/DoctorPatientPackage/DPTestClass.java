
//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)

package DoctorPatientPackage;
import javax.swing.JOptionPane;
import DateTimePackage.Date;
import DateTimePackage.Time;
public class DPTestClass {
	
	public static void main(String args[])
	{
		Doctor[] doctor=new Doctor[5];
		Date[] date=new Date[5];
		Time[] time=new Time[5];
		IndoorPatient[] IP=new IndoorPatient[5];
		OutDoorPatient[] OP=new OutDoorPatient[5];
		Patient[] patient=new Patient[5];
		
		int IPSize,opSize,Dsize,ch;
		String s1;
		
		
		
		
//		String Arsize=JOptionPane.showInputDialog("Enter Array size for IndoorPatient: ");
//		Dsize=Integer.parseInt(Arsize);                   //DOCTOR ARRAY
		
		 do {
			 JOptionPane.showInternalMessageDialog(null, "~~~~~~~~~~~~~~~~~~~~MENU~~~~~~~~~~~~~~~~~~~~~~~\n"
						+ "1.To ADD Indoor Patients\n"
						+ "2.To ADD an OutDoor Patient\n"
						+ "3.To See List of All Doctors\n"
						+ "4.To Search Doctor By Name or Department\n"
						+ "5.To see list of all InDoor Patients\n"
						+ "6.To see the list of all appointments on a certain day\n"
						+ "7.To see the list appointments of a certain Doctor\n"
						+ "8.To Change the Date or time of certain patient");
				s1=JOptionPane.showInputDialog("Enter your Option (from 1 to 8): ");
				ch=Integer.parseInt(s1);
				switch(ch)
				{
				case 1:{
					String arrSize=JOptionPane.showInputDialog("Enter Array size for IndoorPatient: ");
					IPSize=Integer.parseInt(arrSize);
					IndoorPatient ip[]=new IndoorPatient[IPSize];      //INDOOR Patient array;
					
					String st,st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12,st13,st14,st15,st16;
					char g,g1;
					int n,n1,n2,n3,n4,n5;
					for(int i=0;i<IPSize;i++)
					{
						st=JOptionPane.showInputDialog(null,"How many doctors are dealing with this Patient: ");
						n=Integer.parseInt(st);
						int index=0;
						if(index<=n)
						{
							st1=JOptionPane.showInputDialog(null,"Enter Doctor's Name: ");
							st2=JOptionPane.showInputDialog(null,"Enter Doctor's CNIC: ");
							st3=JOptionPane.showInputDialog(null,"Enter Doctor's PhoneNo: ");
							st4=JOptionPane.showInputDialog(null,"Enter Doctor's Gender: ");
						    g=st4.charAt(0);
							st5=JOptionPane.showInputDialog(null,"Enter Doctor's Department Name: ");
							st6=JOptionPane.showInputDialog(null,"Enter Doctor's Specialization");
							doctor[index]=new Doctor(st1,st2,st3,g,st5,st6);	
						}
						if(index<=IPSize)
						{
							st7=JOptionPane.showInputDialog(null,"Enter Patient's WardNo: ");
							n1=Integer.parseInt(st7);
							st8=JOptionPane.showInputDialog(null,"Enter Patient's RoomNo: ");
							n2=Integer.parseInt(st8);
							st9=JOptionPane.showInputDialog(null,"Enter Patient's BedNo: ");
							n3=Integer.parseInt(st9);
							st10=JOptionPane.showInputDialog(null,"Enter Patient's FEE: ");
							n4=Integer.parseInt(st10);
							st11=JOptionPane.showInputDialog(null,"Enter Patient's Name: ");
							st12=JOptionPane.showInputDialog(null,"Enter Patient's CNIC: ");
							st13=JOptionPane.showInputDialog(null,"Enter Patient's Address: ");
							st14=JOptionPane.showInputDialog(null,"Enter Patient's PhoneNo: ");
							st15=JOptionPane.showInputDialog(null,"Enter Patient's Gender: ");
						    g1=st15.charAt(0);
						    st16=JOptionPane.showInputDialog(null,"Enter Patient's Age: ");
							n5=Integer.parseInt(st16);
							
						    IP[index]=new IndoorPatient(n1,n2,n3,n4,doctor,st11,st12,st13,st14,g1,n5);
						    index++;
						}
						
					}
					break;
				}
				case 2:{
					String Asize=JOptionPane.showInputDialog("Enter Array size for IndoorPatient: ");
					opSize=Integer.parseInt(Asize);
					OutDoorPatient op[]=new OutDoorPatient[opSize];   //OUTDOOR Patient array;
					
					String st,st1,st2,st3,st4,st5,st6,st7,st8,st9,st10,st11,st12,st13,st14,st15,st16;
					char g,g1;
					int n,n1,n2,n3,n4,n5,n6;
					for(int i=0;i<opSize;i++)
					{
						st=JOptionPane.showInputDialog(null,"How many doctors are dealing with these Patient: ");
						n=Integer.parseInt(st);
						int index=0;
						if(index<=n)
						{
							st1=JOptionPane.showInputDialog(null,"Enter Doctor's Name: ");
							st2=JOptionPane.showInputDialog(null,"Enter Doctor's CNIC: ");
							st3=JOptionPane.showInputDialog(null,"Enter Doctor's PhoneNo: ");
							st4=JOptionPane.showInputDialog(null,"Enter Doctor's Gender: ");
						    g=st4.charAt(0);
							st5=JOptionPane.showInputDialog(null,"Enter Doctor's Department Name: ");
							st6=JOptionPane.showInputDialog(null,"Enter Doctor's Specialization");
							doctor[index]=new Doctor(st1,st2,st3,g,st5,st6);	
						}
						if(index<=opSize)
						{
							st7=JOptionPane.showInputDialog(null,"Enter Patient's FEE: ");
							n1=Integer.parseInt(st7);
							
							st8=JOptionPane.showInputDialog(null,"Enter Date's Day: ");
							st9=JOptionPane.showInputDialog(null,"Enter Date's Month: ");
							n2=Integer.parseInt(st9);
							st10=JOptionPane.showInputDialog(null,"Enter Date's Year: ");
							n3=Integer.parseInt(st10);
							date[opSize]=new Date(st8,n2,n3);
							
							st11=JOptionPane.showInputDialog(null,"Enter Time's hour: ");
							n4=Integer.parseInt(st11);
							st12=JOptionPane.showInputDialog(null,"Enter Time's minute: ");
							n5=Integer.parseInt(st12);
							st13=JOptionPane.showInputDialog(null,"Enter Time's Period: ");
						
							time[opSize]=new Time(n4,n5,st13);
							
							st11=JOptionPane.showInputDialog(null,"Enter Patient's Name: ");
							st12=JOptionPane.showInputDialog(null,"Enter Patient's CNIC: ");
							st13=JOptionPane.showInputDialog(null,"Enter Patient's Address: ");
							st14=JOptionPane.showInputDialog(null,"Enter Patient's PhoneNo: ");
							st15=JOptionPane.showInputDialog(null,"Enter Patient's Gender: ");
						    g1=st15.charAt(0);
						    st16=JOptionPane.showInputDialog(null,"Enter Patient's Age: ");
							n5=Integer.parseInt(st16);
							
						    OP[index]=new OutDoorPatient(n1,doctor,date[index],time[index],st11,st12,st13,st14,g1,n5);
						    index++;
						}
						}
					break;
				}
				case 3:{
					Doctor d=new Doctor();
					d.displayDoc(doctor);
					break;
				}
				case 4:{
					JOptionPane.showMessageDialog(null, "1:Search doctor by Name.\n "
							+ "2:Search doctor by Department.\n"
							,"OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
					  String str2=JOptionPane.showInputDialog("Select a no from 1 and 2");
					  int x=Integer.parseInt(str2);
					  Doctor w=new Doctor();
					  if(x==1)
					  {
						  str2=JOptionPane.showInputDialog("Doctor Name plz:");
					      if(w.searchName(str2, doctor))
					    	  JOptionPane.showMessageDialog(null, "Doctor exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
					      else
					    	  JOptionPane.showMessageDialog(null, "Doctor does not exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
					  }
					  else if(x==2)
					  {
						  str2=JOptionPane.showInputDialog("Department Name plz:");
						  if(w.searchDepartment(str2, doctor)==true)
							  JOptionPane.showMessageDialog(null, "Department exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
						  else
						      JOptionPane.showMessageDialog(null, "Department does not exists ","SEARCH RESULTS",JOptionPane.WARNING_MESSAGE);
					  }
					  else
						  JOptionPane.showMessageDialog(null, "Option is not available","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
					break;
				}
				case 5:{
					IndoorPatient pi=new IndoorPatient();
					pi.displayIP(IP);
					break;
				}
				case 6:{
					IndoorPatient ip=new IndoorPatient();
					OutDoorPatient op=new OutDoorPatient();
					String str=JOptionPane.showInputDialog("Enter Day:");
					str=ip.appointments(str,IP);
					str=str+op.appointments(str, OP);
					 JOptionPane.showMessageDialog(null,str,"APPOINTMENT ON CERTAIN DATE",JOptionPane.WARNING_MESSAGE);
					break;
				}
				case 7:{
				/*	String s;
					IndoorPatient ip=new IndoorPatient();
					OutDoorPatient op=new OutDoorPatient();
					String str=JOptionPane.showInputDialog("Doctor name plz:");
					s=ip.appointDoctor(str,IP);
					s=s+op.appointDoctor(str,OP);
					 JOptionPane.showMessageDialog(null,s,"APPOINTMENT WITH CERTAIN DOCTOR",JOptionPane.WARNING_MESSAGE);
					
					break;*/
				}
				case 8:{
					IndoorPatient y=new IndoorPatient();
					OutDoorPatient z=new OutDoorPatient();
					JOptionPane.showMessageDialog(null, "i:Change date of indoorPatient.\no:Change date/time of outdoor patient.\n","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
					String str=JOptionPane.showInputDialog("Select character from 'i' or 'o'");
					 char c=str.charAt(0);
					  if(c=='i')
					  {
						  str="Original Date:";
						  JOptionPane.showMessageDialog(null, IP[1].getDate());
						  y.dateChanger(IP[1]);
						  str=str+"Updated Date:"+IP[1].getDDate();
						  JOptionPane.showMessageDialog(null,str,"UPDATION ",JOptionPane.WARNING_MESSAGE);
					  }
					  else if(c=='o')
					  {
						  JOptionPane.showMessageDialog(null, "d:Change date.\nt:Change time.\n","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
						  str=JOptionPane.showInputDialog("Select character from 'd' or 't'");
						  char f=str.charAt(0);
						  if(f=='d')
						  {
						  str="Original date:"+OP[1].getDate();
						  z.dateChanger(OP[1]);
						  str=str+"Updated date:"+OP[1].getDate();
						  JOptionPane.showMessageDialog(null,str,"UPDATION ",JOptionPane.WARNING_MESSAGE);
						  }
						  else if(f=='t')
						  {
							  str="Original Time:"+OP[1].getTime();
							  z.timeChanger(OP[1]);
							  str=str+"Updated Time:"+OP[1].getTime();
							  JOptionPane.showMessageDialog(null,str,"UPDATION ",JOptionPane.WARNING_MESSAGE);
						  }
						  else
							  JOptionPane.showMessageDialog(null, "Option is not available","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
					  }
					  else
						  JOptionPane.showMessageDialog(null, "Option is not available","OPTION SELECTION",JOptionPane.WARNING_MESSAGE);
					break;
				}
				
		 }
    }while(ch!=0);
	}
}
