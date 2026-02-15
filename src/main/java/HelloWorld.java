import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/CI-CD", (req, res) -> "CI CD Pipeline Working and Fetching Jenkins Pipeline from SCM");
	}
}
