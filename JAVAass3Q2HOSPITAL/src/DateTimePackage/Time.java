
//Group members:
//Faiqa Rashid (3833-FBAS/BSCS/F18-A)
//Sehrish Rani (3820-FBAS/BSCS/F18-A)

package DateTimePackage;
import javax.swing.JOptionPane;

public class Time {
    int hour,minute;
	String AmPm;
	public Time()
	{
		this.hour=0;
		this.minute=0;
		this.AmPm="Am";
	}
	public Time(int hour,int minute,String AmPm)
	{
		if(this.hour>=1&&this.hour<=12)
		{
			this.hour=hour;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Hour");
		}
		if(this.minute>=0&& this.minute<=60)
		{
			this.minute=minute;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Minutes");
		}
		if(this.AmPm=="AM"||this.AmPm=="PM")
		{
			this.AmPm=AmPm;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Time Span");
		}
	}
	public void setHour(int hour)
	{
		if(this.hour>=1&&this.hour<=12)
		{
			this.hour=hour;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Hour");
		}
	}
	public int getHour()
	{
		return hour;
	}
	public void setMinute(int minute)
	{
		if(this.minute>=0&& this.minute<=60)
		{
			this.minute=minute;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Minutes");
		}
	}
	public int getMinute()
	{
		return minute;
	}
	public void setAmPm(String AmPm)
	{
		if(this.AmPm=="AM"||this.AmPm=="PM")
		{
			this.AmPm=AmPm;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid Time Span");
		}
	}
	public String toString()
	{
		return "hr::min::AM/PM:  "+hour+"::"+minute+"::"+AmPm+"\n";
	}
}
