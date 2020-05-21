package iris_data.workbench;


public class DeepLearningApp {

	public static void main(String[] args) throws Exception {
	
		String path = "/Users/michael/Desktop/dl4j-workspace/iris_data.workbench/";
		
		IrisClassifier classifier = new IrisClassifier();
		classifier.classify("iris.csv","iris-test.csv");
	}
}