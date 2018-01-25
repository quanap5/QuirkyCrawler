package featureFull.sclab.ac.chonnam;

import features.sclab.ac.chonnam.Contribution_items;

public class MyData {

	// the MountainBike subclass adds one field
	public int creator_id;
	public String created_at;
	String content;
	int id;
	String range_min;
	int contribution_id;
	String[] choices;
	String number;
	String type;
	String number_in_set;
	String range_max;
	int crea_id;

	public MyData(features.sclab.ac.chonnam.Contribution_items contribution_items, int crea_id, String crea_at) {
		// TODO Auto-generated constructor stub
		content = contribution_items.getContent();
		id = contribution_items.getId();
		range_min = contribution_items.getRange_min();
		contribution_id = contribution_items.getContribution_id();
		choices = contribution_items.getChoices();
		number = contribution_items.getNumber();
		type = contribution_items.getType();
		number_in_set = contribution_items.getNumber_in_set();
		range_max = contribution_items.getRange_max();
		creator_id = crea_id;
		created_at = crea_at;
	}

	public MyData(inspiration.sclab.ac.chonnam.Contribution_items contribution_items, int creator_id2,
			String created_at2) {
		content = contribution_items.getContent();
		id = contribution_items.getId();
		range_min = contribution_items.getRange_min();
		contribution_id = contribution_items.getContribution_id();
		choices = contribution_items.getChoices();
		number = contribution_items.getNumber();
		type = contribution_items.getType();
		number_in_set = contribution_items.getNumber_in_set();
		range_max = contribution_items.getRange_max();
		creator_id = creator_id2;
		created_at = created_at2;
	}

	public MyData(inspiration.sclab.ac.chonnam.Contribution_items contribution_items, int creator_id2,
			String created_at2, String url) {
		content = url;
		id = contribution_items.getId();
		range_min = contribution_items.getRange_min();
		contribution_id = contribution_items.getContribution_id();
		choices = contribution_items.getChoices();
		number = contribution_items.getNumber();
		type = contribution_items.getType();
		number_in_set = contribution_items.getNumber_in_set();
		range_max = contribution_items.getRange_max();
		creator_id = creator_id2;
		created_at = created_at2;
	}

	public MyData(sketches.sclab.ac.chonnam.Contribution_items contribution_items, int creator_id2,
			String created_at2) {
		content = contribution_items.getContent();
		id = contribution_items.getId();
		range_min = contribution_items.getRange_min();
		contribution_id = contribution_items.getContribution_id();
		choices = contribution_items.getChoices();
		number = contribution_items.getNumber();
		type = contribution_items.getType();
		number_in_set = contribution_items.getNumber_in_set();
		range_max = contribution_items.getRange_max();
		creator_id = creator_id2;
		created_at = created_at2;
	}

	public MyData(sketches.sclab.ac.chonnam.Contribution_items contribution_items, int creator_id2, String created_at2,
			String url) {
		content = url;
		id = contribution_items.getId();
		range_min = contribution_items.getRange_min();
		contribution_id = contribution_items.getContribution_id();
		choices = contribution_items.getChoices();
		number = contribution_items.getNumber();
		type = contribution_items.getType();
		number_in_set = contribution_items.getNumber_in_set();
		range_max = contribution_items.getRange_max();
		creator_id = creator_id2;
		created_at = created_at2;
	}

	public MyData(_3Dmodels.sclab.ac.chonnam.Contribution_items contribution_items, int creator_id2,
			String created_at2) {
		content = contribution_items.getContent();
		id = contribution_items.getId();
		range_min = contribution_items.getRange_min();
		contribution_id = contribution_items.getContribution_id();
		choices = contribution_items.getChoices();
		number = contribution_items.getNumber();
		type = contribution_items.getType();
		number_in_set = contribution_items.getNumber_in_set();
		range_max = contribution_items.getRange_max();
		creator_id = creator_id2;
		created_at = created_at2;
	}

	public MyData(pitches.sclab.ac.chonnam.Contribution_items contribution_items, int creator_id2, String created_at2) {
		content = contribution_items.getContent();
		id = contribution_items.getId();
		range_min = contribution_items.getRange_min();
		contribution_id = contribution_items.getContribution_id();
		choices = contribution_items.getChoices();
		number = contribution_items.getNumber();
		type = contribution_items.getType();
		number_in_set = contribution_items.getNumber_in_set();
		range_max = contribution_items.getRange_max();
		creator_id = creator_id2;
		created_at = created_at2;
	}

}