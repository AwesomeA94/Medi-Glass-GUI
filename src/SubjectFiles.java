
/*
 So basically this is the database of the patient
 We allocate a Name, a example heart rate, and what to do with the patient if 
 they visited recently or not
 Also with XRays we gave sample examples, just for fun
 */
public class SubjectFiles extends Med_GUI_Maker {
	
public static void Condition(int Check)
	{
		switch (Check){
		case 1:
			Name.setText("Abigail Rale");
			Condition.setText("Heart Rate: 143 bpm");
			Info.setText("Last visit: 4 months ago");
			Info2.setText("Needs blood test");
			break;
		case 2:
			Name.setText("Mark Jarvo");
			Condition.setText("Heart Rate: 168 bpm");
			Info.setText("Last Visit: 1 year ago");
			Info2.setText("Check Eye Dilation");
			break;
		case 3:
			Name.setText("Unknown");
			Condition.setText("Heart Rate: Unknown");
			Info.setText("Last visit: Never Registered");
			Info2.setText("Register Patient");
			break;
		case 4:
			Name.setText("Sasha Yukenov");
			Condition.setText("Heart Rate: 120 bpm");
			Info.setText("Last visit: 2 weeks ago");
			Info2.setText("Check throat, give Flu Shot");
			break;
		case 5:
			Name.setText("Stan Lee");
			Condition.setText("Heart Rate: 200 bpm");
			Info.setText("Last visit: 1 month ago");
			Info2.setText("Needs Chicken Pots Vaccine");
			break;
		
		
		}
	}
public static void XRaySynop(int Scan)
    {
	switch (Scan)
	{
	case 1:
		XraySynop.setText("Nothing Found");
		Suggestion.setText("Give lolipop!");
		break;
	case 2:
		XraySynop.setText("Hairline Fracture");
		Suggestion.setText("Send to bone specialist");
		break;
	case 3:
		XraySynop.setText("Enlarged Heart");
		Suggestion.setText("Send to Emergency Room");
		break;
	case 4:
		XraySynop.setText("Metal Obstruction");
		Suggestion.setText("Magnet pull out/Surgery");
		break;
	case 5:
		XraySynop.setText("Chest Pain");
		Suggestion.setText("Give cough medicine");
		break;
	}
	
    }

}
