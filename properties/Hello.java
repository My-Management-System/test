import java.util.*;
import java.text.MessageFormat;

public class Hello
{
	public static void main(String[] args){

		Locale myLocale = null;
		if(args.length==2)
		{
			myLocale = new  Locale(args[0],args[1]);
		}else
		{
			myLocale = Locale.getDefault(Locale.Category.FORMAT);
		}
		ResourceBundle rsb = ResourceBundle.getBundle("mymess",myLocale);
		String msg = rsb.getString("msg");
		System.out.println(MessageFormat.format(msg,"yeeku",new Date()));
	}
}