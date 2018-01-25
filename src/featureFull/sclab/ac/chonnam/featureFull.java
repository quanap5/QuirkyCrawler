package featureFull.sclab.ac.chonnam;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import com.google.gson.Gson;

import _3Dmodels.sclab.ac.chonnam.Quirky_3Dmodels;
import features.sclab.ac.chonnam.Quirky_Feature;

import inspiration.sclab.ac.chonnam.Quirky_Inspiration;
import pitches.sclab.ac.chonnam.Quirky_Pitches;
import sketches.sclab.ac.chonnam.Quirky_Sketches;

public class featureFull {

	public static void main(String[] args) throws MalformedURLException, IOException {
		Quirky_Feature q1 = new Quirky_Feature();
		Quirky_Inspiration q2 = new Quirky_Inspiration();
		Quirky_Sketches q3=new Quirky_Sketches();
		Quirky_3Dmodels q4=new Quirky_3Dmodels();
		Quirky_Pitches q5=new Quirky_Pitches();
		ArrayList<MyData> list_q = new ArrayList<MyData>();
		//Smart home*:669312 
		//PiezoPal*: 757014
		//Triple 3D Game: 786229
		//Flower pot: 781839
		//Pawcet: 491950
		//Cntrolink: 784133
		//Fruit grabber: 772185
		//Intermediate GE LinklightBuld: 781041
		int id_invention =669312;
		list_q.addAll(q1.Quirky_Feature(id_invention ));
		list_q.addAll(q2.Quirky_Inspiration(id_invention+1));
		list_q.addAll(q3.Quirky_Sketches(id_invention+2));
		list_q.addAll(q4.Quirky_3Dmodels(id_invention+3));
		list_q.addAll(q5.Quirky_Pitches(id_invention+4));

		Gson gson1 = new Gson();
		String json1 = gson1.toJson(list_q);
		// Date and current time
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
		Calendar cal = Calendar.getInstance();
		String mynamefile = "FullFeature" +Integer.toString(id_invention)+"_"+ dateFormat.format(cal.getTime()) + ".txt";
		try {
			FileWriter writer = new FileWriter(mynamefile);
			writer.write(json1);
			writer.close();
			System.out.println("Write FULL FEATURE: OKKKKK");

		} catch (Exception e) {
			// TODO: handle exception

		}

	}
}
