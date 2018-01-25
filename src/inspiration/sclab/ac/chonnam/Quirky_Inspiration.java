package inspiration.sclab.ac.chonnam;

import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import featureFull.sclab.ac.chonnam.MyData;

public class Quirky_Inspiration {
	public ArrayList<MyData> Quirky_Inspiration(int in_invention) throws MalformedURLException, IOException {
		String url1 = "https://www.quirky.com/api/v1/contributions/for_project?parent_id="
				+ Integer.toString(in_invention)
				+ "&parent_class=Project&paginated_options[contributions][use_cursor]=true&paginated_options[contributions][per_page]=12&paginated_options[contributions][order_column]=created_at&paginated_options[contributions][order]=desc";
		// int k=970;
		String next_index = "";
		String nextpage = "true";
		int length_invention = 0;
		int tri = 1;
		// ArrayList <Contribution_items> feature_Data = new
		// ArrayList<Contribution_items>() ;
		ArrayList<MyData> inspiration_Data = new ArrayList<MyData>();
		while (nextpage == "true") {
			tri = tri + 1;

			String url = url1 + next_index;
			String json = IOUtils.toString(new URL(url));

			Gson gson = new GsonBuilder().create();

			MyPojo myPojo = gson.fromJson(json, MyPojo.class);
			// myDataTotal.add(myPojo);
			// length_invention=length_invention+myPojo.getData().getInventions().length;

			// Extract data matching
			int l = myPojo.getData().getContribution_items().length;
			int total_item = 0;
			for (int i = 0; i < myPojo.getData().getContributions().length; i++) {
				next_index = "&paginated_options[contributions][cursor]="
						+ myPojo.getData().getContributions()[myPojo.getData().getContribution_items().length / 2 - 1]
								.getCreated_at();
				nextpage = myPojo.getPaginated_meta().getContributions().getHas_next_page();
				// feature_Data.add(myPojo.getData().getContribution_items()[i]);
				int set_item = myPojo.getData().getContributions()[i].getContribution_set()
						.getContribution_set_items().length;

				for (int item = 0; item < set_item; item++) {
					System.out.println(myPojo.getData().getContributions()[i].getContribution_set().getContribution_set_items()[item].getContribution_item_type());
					switch (myPojo.getData().getContributions()[i].getContribution_set().getContribution_set_items()[item].getContribution_item_type()) {
					case "ContributionItemImage":
						MyData myData1 = new MyData(myPojo.getData().getContribution_items()[l - 1 - total_item],myPojo.getData().getContributions()[i].getCreator_id(),myPojo.getData().getContributions()[i].getCreated_at(),myPojo.getData().getAttachments()[myPojo.getData().getAttachments().length-1-i].getAsset().getUrl());
						inspiration_Data.add(myData1);	
						
						break;

					default:
						MyData myData11 = new MyData(myPojo.getData().getContribution_items()[l - 1 - total_item],
						myPojo.getData().getContributions()[i].getCreator_id(),
						myPojo.getData().getContributions()[i].getCreated_at());
						inspiration_Data.add(myData11);
						break;
					}
		
				
					total_item = total_item + 1;
					System.out.println("Inspiration");
				}

				
				// System.out.print("Id:");
				// System.out.println(myPojo.getData().getContribution_items()[i].getId());
				// System.out.print("Creator_id:");
				// System.out.println(myPojo.getData().getContributions()[i].getCreator_id());
				// System.out.print("Contribution_Id:");
				// System.out.println(myPojo.getData().getContribution_items()[i].getContribution_id());
				// System.out.print("Number_in_set:");
				// System.out.println(myPojo.getData().getContribution_items()[i].getNumber_in_set());
				// System.out.print("Type:");
				// System.out.println(myPojo.getData().getContribution_items()[i].getType());
				// System.out.print("CONTENT:");
				// System.out.println(myPojo.getData().getContribution_items()[i].getContent());
				//
				// System.out.println(myPojo.getPaginated_meta().getContributions().getHas_next_page());

			}

		}
//		Gson gson1 = new Gson();
//		String json1 = gson1.toJson(inspiration_Data);
//		//System.out.println(json1);
//		// Date and current time
//		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HH_mm_ss");
//		Calendar cal = Calendar.getInstance();
//		// System.out.print("Running at time:");
//		// System.out.println(dateFormat.format(cal.getTime()));
//		String mynamefile = "Inspiration_quirky" + dateFormat.format(cal.getTime()) + ".txt";
//		// String
//		// mynamefileTotal="InfluenceTotal_quirky"+dateFormat.format(cal.getTime())+".txt";
//		try {
//			FileWriter writer = new FileWriter(mynamefile);
//			writer.write(json1);
//			writer.close();
//			System.out.println("Write INSPIRATION: OKKK");
//
//		} catch (Exception e) {
//			// TODO: handle exception
//
//		}
		return inspiration_Data;

	}

}
