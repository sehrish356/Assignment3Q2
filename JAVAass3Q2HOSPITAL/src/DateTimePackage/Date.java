
//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)


package DateTimePackage;
import javax.swing.JOptionPane;

public class Date {
	String day;
	int month,year;
public Date()
{
	day="Wednesday";
	month=11;
	year=2020;
}
public Date(String day,int month, int year)
{
	if(this.day=="Monday" || this.day=="Tuesday"|| this.day=="Wednesday"|| this.day=="Thursday"|| this.day=="Friday"|| this.day=="Saturday"|| this.day=="Sunday")
	{
		this.day=day;
	}
	else
	{
		System.out.println("Please Enter valid day");
	}
	if(this.month>=1&&this.month<=31)
	{
		this.month=month;
	}
	else
	{
		System.out.println("Please Enter valid month");
	}
	this.year=year;
}
public void setDay(String day)
{
	if(this.day=="Monday" || this.day=="Tuesday"|| this.day=="Wednesday"|| this.day=="Thursday"|| this.day=="Friday"|| this.day=="Saturday"|| this.day=="Sunday")
	{
		this.day=day;
	}
	else
	{
		JOptionPane.showMessageDialog(null,"Please Enter valid day");
	}
}
public String getDay()
{
	return day;
}
public void setMonth(int month)
{
	if(this.month>=1&&this.month<=31)
	{
		this.month=month;
	}
	else
	{
		JOptionPane.showMessageDialog(null,"Please Enter valid month");
	}
}
public int getMonth()
{
	return month;
}
public void setYear(int year)
{
	this.year=year;
}
public int getYear()
{
	return year;
}
public String toString()
{
	return "dd/mm/yy: "+day+"/'"+month+"/'"+year+"\n";
}
}
