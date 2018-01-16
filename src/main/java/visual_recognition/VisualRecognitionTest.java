package visual_recognition;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyImagesOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.VisualClassification;

public class VisualRecognitionTest {
	
	public static void main(String[] args) {
		
		VisualRecognition service = new VisualRecognition(VisualRecognition.VERSION_DATE_2016_05_20);
		service.setApiKey("c571801100fa89cd401410df201962d1236e97c3");

		System.out.println("Classify an image");
		ClassifyImagesOptions options = new ClassifyImagesOptions.Builder()
		    .url("http://www.fashionn.com/files/board/2015/image/p1a3aaq9q112pot75eovnlub5n1.jpg")
		    .build();
		VisualClassification result = service.classify(options).execute();
		System.out.println(result);
		
	}

}
